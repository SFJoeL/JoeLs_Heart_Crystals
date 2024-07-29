package net.joel.heartcrystals.item;

import net.joel.heartcrystals.JoelsHeartCrystals;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JoelsHeartCrystals.MODID);



    // Add items here
    public static final RegistryObject<Item> HeartCrystal =  ITEMS.register("heartcrystal", ()-> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
