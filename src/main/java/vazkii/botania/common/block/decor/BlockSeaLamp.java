/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Jun 28, 2014, 9:24:43 PM (GMT)]
 */
package vazkii.botania.common.block.decor;

import cpw.mods.fml.common.Optional;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import vazkii.botania.api.lexicon.ILexiconable;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.common.block.BlockMod;
import vazkii.botania.common.integration.coloredlights.ColoredLightHelper;
import vazkii.botania.common.lexicon.LexiconData;
import vazkii.botania.common.lib.LibBlockNames;

public class BlockSeaLamp extends BlockMod implements ILexiconable {

	public BlockSeaLamp() {
		super(Material.glass);
		setHardness(0.3F);
		setStepSound(soundTypeGlass);
		setLightLevel(1.0F);
		setBlockName(LibBlockNames.SEA_LAMP);
	}
	
	int coloredLight = -1;
	
	@Override
	@Optional.Method(modid = "easycoloredlights")
    public int getLightValue(IBlockAccess world, int x, int y, int z) {
		return coloredLight == -1 ? (coloredLight = ColoredLightHelper.makeRGBLightValue(85, 136, 125, originalLight)) : coloredLight;
    }

	@Override
	public LexiconEntry getEntry(World world, int x, int y, int z, EntityPlayer player, ItemStack lexicon) {
		return LexiconData.prismarine;
	}

}
