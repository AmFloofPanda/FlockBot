package de.flockiix.flockbot.core.util;

import de.flockiix.flockbot.core.config.Config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtils {
    public static final List<String> ACTIVITIES = new ArrayList<>(Arrays.asList(Config.get("ACTIVITIES").split("~")));
    public static final List<String> ERROR_MESSAGES = new ArrayList<>(Arrays.asList(Config.get("ERROR_MESSAGES").split("~")));
}
