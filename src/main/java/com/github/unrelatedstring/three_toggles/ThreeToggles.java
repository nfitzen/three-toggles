package com.github.unrelatedstring.three_toggles;

import net.fabricmc.api.ClientModInitializer;

public class ThreeToggles implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric client!");
	}
}
