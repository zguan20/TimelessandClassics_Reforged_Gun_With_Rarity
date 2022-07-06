package com.tac.guns.client.handler;


import com.tac.guns.Reference;
import com.tac.guns.client.KeyBinds;
import com.tac.guns.network.PacketHandler;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;


/**
 * Author: ClumsyAlien
 */

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SightSwitchEvent
{
    private static SightSwitchEvent instance;

    public static SightSwitchEvent get()
    {
        if(instance == null)
        {
            instance = new SightSwitchEvent();
        }
        return instance;
    }

    private SightSwitchEvent()
    {
    }

    /*@SubscribeEvent
    public void onKeyPressed(InputEvent.KeyInputEvent event)
    {
        if(Minecraft.getInstance().player == null) {return;}
        if(KeyBinds.KEY_SIGHT_SWITCH.isPressed() && event.getAction() == GLFW.GLFW_PRESS)
        {
            PacketHandler.getPlayChannel().sendToServer(new MessageIronSightSwitch());
        }
    }
*/
}

