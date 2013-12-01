package org.trypticon.gum.eio.internal;

import org.trypticon.gum.eio.FolderType;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author trejkaz
 */
class FolderTypeMappings {
    private static final Map<FolderType, Integer> map = new EnumMap<>(FolderType.class);
    static {
        map.put(FolderType.DESKTOP, i("desk"));
        map.put(FolderType.TRASH, i("trsh"));
        map.put(FolderType.WHERE_TO_EMPTY_TRASH, i("empt"));
        map.put(FolderType.FONTS, i("font"));
        map.put(FolderType.PREFERENCES, i("pref"));
        map.put(FolderType.SYSTEM_PREFERENCES, i("sprf"));
        map.put(FolderType.TEMPORARY, i("temp"));
        map.put(FolderType.CHEWABLE_ITEMS, i("flnt"));
        map.put(FolderType.TEMPORARY_ITEMS_IN_CACHE_DATA, i("vtmp"));
        map.put(FolderType.APPLICATIONS, i("apps"));
        map.put(FolderType.VOLUME_ROOT, i("root"));
        map.put(FolderType.DOMAIN_TOP_LEVEL, i("dtop"));
        map.put(FolderType.DOMAIN_LIBRARY, i("dlib"));
        map.put(FolderType.USERS, i("usrs"));
        map.put(FolderType.CURRENT_USER, i("cusr"));
        map.put(FolderType.SHARED_USER_DATA, i("sdat"));
        map.put(FolderType.DOCUMENTS, i("docs"));
        map.put(FolderType.PICTURE_DOCUMENTS, i("pdoc"));
        map.put(FolderType.MOVIE_DOCUMENTS, i("mdoc"));
        map.put(FolderType.MUSIC_DOCUMENTS, 0xB5646F63);
        map.put(FolderType.INTERNET_SITES, i("site"));
        map.put(FolderType.PUBLIC, i("pubb"));
        map.put(FolderType.DROP_BOX, i("drop"));
        map.put(FolderType.SHARED_LIBRARIES, 0xC46C6962);
        map.put(FolderType.VOICES, i("fvoc"));
        map.put(FolderType.UTILITIES, 0x757469C4);
        map.put(FolderType.THEMES, i("thme"));
        map.put(FolderType.FAVORITES, i("favs"));
        map.put(FolderType.INTERNET_SEARCH_SITES, i("issf"));
        map.put(FolderType.INSTALLER_LOGS, i("ilgf"));
        map.put(FolderType.SCRIPTS, 0x736372C4);
        map.put(FolderType.FOLDER_ACTIONS, i("fasf"));
        map.put(FolderType.SPEAKABLE_ITEMS, i("spki"));
        map.put(FolderType.KEYCHAIN, i("kchn"));
        map.put(FolderType.COLOR_SYNC, i("sync"));
        map.put(FolderType.COLOR_SYNC_CMM, i("ccmm"));
        map.put(FolderType.COLOR_SYNC_SCRIPTING, i("cscr"));
        map.put(FolderType.PRINTERS, i("impr"));
        map.put(FolderType.SPEECH, i("spch"));
        map.put(FolderType.CARBON_LIBRARY, i("carb"));
        map.put(FolderType.DOCUMENTATION, i("info"));
        map.put(FolderType.ISS_DOWNLOADS, i("issd"));
        map.put(FolderType.USER_SPECIFIC_TMP, i("utmp"));
        map.put(FolderType.CACHED_DATA, i("cach"));
        map.put(FolderType.FRAMEWORKS, i("fram"));
        map.put(FolderType.PRIVATE_FRAMEWORKS, i("pfrm"));
        map.put(FolderType.CLASSIC_DESKTOP, i("sdsk"));
        map.put(FolderType.SYSTEM_SOUNDS, i("ssnd"));
        map.put(FolderType.COMPONENTS, i("cmpd"));
        map.put(FolderType.QUICK_TIME_COMPONENTS, i("wcmp"));
        map.put(FolderType.CORE_SERVICES, i("csrv"));
        map.put(FolderType.AUDIO_SUPPORT, i("adio"));
        map.put(FolderType.AUDIO_PRESETS, i("apst"));
        map.put(FolderType.AUDIO_SOUNDS, i("asnd"));
        map.put(FolderType.AUDIO_SOUND_BANKS, i("bank"));
        map.put(FolderType.AUDIO_ALERT_SOUNDS, i("alrt"));
        map.put(FolderType.AUDIO_PLUG_INS, i("aplg"));
        map.put(FolderType.AUDIO_COMPONENTS, i("acmp"));
        map.put(FolderType.KERNEL_EXTENSIONS, i("kext"));
        map.put(FolderType.DIRECTORY_SERVICES, i("dsrv"));
        map.put(FolderType.DIRECTORY_SERVICES_PLUG_INS, i("dplg"));
        map.put(FolderType.INSTALLER_RECEIPTS, i("rcpt"));
        map.put(FolderType.FILE_SYSTEM_SUPPORT, i("fsys"));
        map.put(FolderType.APPLE_SHARE_SUPPORT, i("shar"));
        map.put(FolderType.APPLE_SHARE_AUTHENTICATION, i("auth"));
        map.put(FolderType.MIDI_DRIVERS, i("midi"));
        map.put(FolderType.KEYBOARD_LAYOUTS, i("klay"));
        map.put(FolderType.INDEX_FILES, i("indx"));
        map.put(FolderType.FIND_BY_CONTENT_INDEXES, i("fbcx"));
        map.put(FolderType.MANAGED_ITEMS, i("mang"));
        map.put(FolderType.BOOT_TIME_STARTUP_ITEMS, i("empz"));
        map.put(FolderType.AUTOMATOR_WORKFLOWS, i("flow"));
        map.put(FolderType.AUTOSAVE_INFORMATION, i("asav"));
        map.put(FolderType.SPOTLIGHT_SAVED_SEARCHES, i("spot"));
        map.put(FolderType.SPOTLIGHT_IMPORTERS, i("simp"));
        map.put(FolderType.SPOTLIGHT_METADATA_CACHE, i("scch"));
        map.put(FolderType.INPUT_MANAGERS, i("inpt"));
        map.put(FolderType.INPUT_METHODS, i("inpf"));
        map.put(FolderType.LIBRARY_ASSISTANTS, i("astl"));
        map.put(FolderType.AUDIO_DIGIDESIGN, i("adig"));
        map.put(FolderType.AUDIO_VST, i("avst"));
        map.put(FolderType.COLOR_PICKERS, i("cpkr"));
        map.put(FolderType.COMPOSITIONS, i("cmps"));
        map.put(FolderType.FONT_COLLECTIONS, i("fncl"));
        map.put(FolderType.I_MOVIE, i("imov"));
        map.put(FolderType.I_MOVIE_PLUG_INS, i("impi"));
        map.put(FolderType.I_MOVIE_SOUND_EFFECTS, i("imse"));
        map.put(FolderType.DOWNLOADS, i("down"));
        map.put(FolderType.COLOR_SYNC_PROFILES, i("prof"));
        map.put(FolderType.APPLICATION_SUPPORT, i("asup"));
        map.put(FolderType.TEXT_ENCODINGS, 0xC4746578);
        map.put(FolderType.PRINTER_DESCRIPTION, i("ppdf"));
        map.put(FolderType.PRINTER_DRIVER, 0xC4707264);
        map.put(FolderType.SCRIPTING_ADDITIONS, 0xC4736372);
        map.put(FolderType.CLASSIC_PREFERENCES, i("cprf"));
        map.put(FolderType.QUICK_LOOK, i("qlck"));
        map.put(FolderType.SERVICES, i("svcs"));

        // Omitted the Classic environment stuff because it isn't enabled in Mac OS X anymore.
    }

    private static int i(String str) {
        return com.apple.eio.FileManager.OSTypeToInt(str);
    }

    static int convert(FolderType folderType) {
        Integer result = map.get(folderType);
        if (result == null) {
            throw new IllegalArgumentException("Unknown folder type: " + folderType);
        }
        return result;
    }
}
