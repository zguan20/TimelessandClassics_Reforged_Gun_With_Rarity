package com.tac.guns.datagen;

import com.tac.guns.Reference;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagGen extends BlockTagsProvider
{
    public BlockTagGen(DataGenerator generatorIn, ExistingFileHelper existingFileHelper)
    {
        super(generatorIn, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags()
    {
    }
}
