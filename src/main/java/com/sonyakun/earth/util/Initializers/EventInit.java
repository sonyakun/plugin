package com.sonyakun.earth.util.Initializers;

import org.bukkit.event.Listener;

import com.sonyakun.earth.util.Plugin;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

public class EventInit {
    public static void init() {
		try {
			ClassPath cp = ClassPath.from(CommandInit.class.getClassLoader());
			for (ClassInfo classInfo : cp.getTopLevelClassesRecursive("com.sonyakun.earth.util.Events")) {
				Class<?> clazz = Class.forName(classInfo.getName());
				try {
					if (Listener.class.isAssignableFrom(clazz)) {
						Listener event = (Listener) clazz.getDeclaredConstructor().newInstance();
						String eventName = classInfo.getSimpleName().replace("Event", "");
						Plugin.plugin.getServer().getPluginManager().registerEvents(event, Plugin.plugin);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
