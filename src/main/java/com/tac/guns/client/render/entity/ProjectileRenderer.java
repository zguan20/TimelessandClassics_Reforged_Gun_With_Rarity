package com.tac.guns.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.tac.guns.client.util.RenderUtil;
import com.tac.guns.entity.ProjectileEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class ProjectileRenderer extends EntityRenderer<ProjectileEntity>
{
    public ProjectileRenderer(EntityRendererManager renderManager)
    {
        super(renderManager);
    }

    @Override
    public ResourceLocation getEntityTexture(ProjectileEntity entity)
    {
        return null;
    }

    @Override
    public void render(ProjectileEntity entity, float entityYaw, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light)
    {
        if(!entity.getProjectile().isVisible() || entity.ticksExisted <= 1)
        {
            return;
        }

        matrixStack.push();

        if(!RenderUtil.getModel(entity.getItem()).isGui3d())
        {
            matrixStack.rotate(this.renderManager.getCameraOrientation());
            matrixStack.rotate(Vector3f.YP.rotationDegrees(180.0F));
            Minecraft.getInstance().getItemRenderer().renderItem(entity.getItem(), ItemCameraTransforms.TransformType.GROUND, light, OverlayTexture.NO_OVERLAY, matrixStack, renderTypeBuffer);
        }
        else
        {
            matrixStack.rotate(Vector3f.YP.rotationDegrees(180F));
            matrixStack.rotate(Vector3f.YP.rotationDegrees(entityYaw));
            matrixStack.rotate(Vector3f.XP.rotationDegrees(entity.rotationPitch));
            Minecraft.getInstance().getItemRenderer().renderItem(entity.getItem(), ItemCameraTransforms.TransformType.NONE, light, OverlayTexture.NO_OVERLAY, matrixStack, renderTypeBuffer);
        }

        matrixStack.pop();
    }
}
