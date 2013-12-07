/*
 * Gum - a thin shim around the com.apple extension classes
 * Copyright (C) 2013  Trejkaz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.trypticon.gum.eio;

/**
 * Enumeration of known folder types.
 *
 * @author trejkaz
 */
public enum FolderType {

    /**
     * kDesktopFolderType
     */
    DESKTOP,

    /**
     * kTrashFolderType
     */
    TRASH,

    /**
     * kWhereToEmptyTrashFolderType
     */
    WHERE_TO_EMPTY_TRASH,

    /**
     * kFontsFolderType
     */
    FONTS,

    /**
     * kPreferencesFolderType
     */
    PREFERENCES,

    /**
     * kSystemPreferencesFolderType
     */
    SYSTEM_PREFERENCES,

    /**
     * kTemporaryFolderType
     */
    TEMPORARY,

    /**
     * kChewableItemsFolderType
     */
    CHEWABLE_ITEMS,

    /**
     * kTemporaryItemsInCacheDataFolderType
     */
    TEMPORARY_ITEMS_IN_CACHE_DATA,

    /**
     * kApplicationsFolderType
     */
    APPLICATIONS,

    /**
     * kVolumeRootFolderType
     */
    VOLUME_ROOT,

    /**
     * kDomainTopLevelFolderType
     */
    DOMAIN_TOP_LEVEL,

    /**
     * kDomainLibraryFolderType
     */
    DOMAIN_LIBRARY,

    /**
     * kUsersFolderType
     */
    USERS,

    /**
     * kCurrentUserFolderType
     */
    CURRENT_USER,

    /**
     * kSharedUserDataFolderType
     */
    SHARED_USER_DATA,

    /**
     * kDocumentsFolderType
     */
    DOCUMENTS,

    /**
     * kPictureDocumentsFolderType
     */
    PICTURE_DOCUMENTS,

    /**
     * kMovieDocumentsFolderType
     */
    MOVIE_DOCUMENTS,

    /**
     * kMusicDocumentsFolderType
     */
    MUSIC_DOCUMENTS,

    /**
     * kInternetSitesFolderType
     */
    INTERNET_SITES,

    /**
     * kPublicFolderType
     */
    PUBLIC,

    /**
     * kDropBoxFolderType
     */
    DROP_BOX,

    /**
     * kSharedLibrariesFolderType
     */
    SHARED_LIBRARIES,

    /**
     * kVoicesFolderType
     */
    VOICES,

    /**
     * kUtilitiesFolderType
     */
    UTILITIES,

    /**
     * kThemesFolderType
     */
    THEMES,

    /**
     * kFavoritesFolderType
     */
    FAVORITES,

    /**
     * kInternetSearchSitesFolderType
     */
    INTERNET_SEARCH_SITES,

    /**
     * kInstallerLogsFolderType
     */
    INSTALLER_LOGS,

    /**
     * kScriptsFolderType
     */
    SCRIPTS,

    /**
     * kFolderActionsFolderType
     */
    FOLDER_ACTIONS,

    /**
     * kSpeakableItemsFolderType
     */
    SPEAKABLE_ITEMS,

    /**
     * kKeychainFolderType
     */
    KEYCHAIN,

    /**
     * kColorSyncFolderType
     */
    COLOR_SYNC,

    /**
     * kColorSyncCMMFolderType
     */
    COLOR_SYNC_CMM,

    /**
     * kColorSyncScriptingFolderType
     */
    COLOR_SYNC_SCRIPTING,

    /**
     * kPrintersFolderType
     */
    PRINTERS,

    /**
     * kSpeechFolderType
     */
    SPEECH,

    /**
     * kCarbonLibraryFolderType
     */
    CARBON_LIBRARY,

    /**
     * kDocumentationFolderType
     */
    DOCUMENTATION,

    /**
     * kISSDownloadsFolderType
     */
    ISS_DOWNLOADS,

    /**
     * kUserSpecificTmpFolderType
     */
    USER_SPECIFIC_TMP,

    /**
     * kCachedDataFolderType
     */
    CACHED_DATA,

    /**
     * kFrameworksFolderType
     */
    FRAMEWORKS,

    /**
     * kPrivateFrameworksFolderType
     */
    PRIVATE_FRAMEWORKS,

    /**
     * kClassicDesktopFolderType
     */
    CLASSIC_DESKTOP,

    /**
     * kSystemSoundsFolderType
     */
    SYSTEM_SOUNDS,

    /**
     * kComponentsFolderType
     */
    COMPONENTS,

    /**
     * kQuickTimeComponentsFolderType
     */
    QUICK_TIME_COMPONENTS,

    /**
     * kCoreServicesFolderType
     */
    CORE_SERVICES,

    /**
     * kAudioSupportFolderType
     */
    AUDIO_SUPPORT,

    /**
     * kAudioPresetsFolderType
     */
    AUDIO_PRESETS,

    /**
     * kAudioSoundsFolderType
     */
    AUDIO_SOUNDS,

    /**
     * kAudioSoundBanksFolderType
     */
    AUDIO_SOUND_BANKS,

    /**
     * kAudioAlertSoundsFolderType
     */
    AUDIO_ALERT_SOUNDS,

    /**
     * kAudioPlugInsFolderType
     */
    AUDIO_PLUG_INS,

    /**
     * kAudioComponentsFolderType
     */
    AUDIO_COMPONENTS,

    /**
     * kKernelExtensionsFolderType
     */
    KERNEL_EXTENSIONS,

    /**
     * kDirectoryServicesFolderType
     */
    DIRECTORY_SERVICES,

    /**
     * kDirectoryServicesPlugInsFolderType
     */
    DIRECTORY_SERVICES_PLUG_INS,

    /**
     * kInstallerReceiptsFolderType
     */
    INSTALLER_RECEIPTS,

    /**
     * kFileSystemSupportFolderType
     */
    FILE_SYSTEM_SUPPORT,

    /**
     * kAppleShareSupportFolderType
     */
    APPLE_SHARE_SUPPORT,

    /**
     * kAppleShareAuthenticationFolderType
     */
    APPLE_SHARE_AUTHENTICATION,

    /**
     * kMIDIDriversFolderType
     */
    MIDI_DRIVERS,

    /**
     * kKeyboardLayoutsFolderType
     */
    KEYBOARD_LAYOUTS,

    /**
     * kIndexFilesFolderType
     */
    INDEX_FILES,

    /**
     * kFindByContentIndexesFolderType
     */
    FIND_BY_CONTENT_INDEXES,

    /**
     * kManagedItemsFolderType
     */
    MANAGED_ITEMS,

    /**
     * kBootTimeStartupItemsFolderType
     */
    BOOT_TIME_STARTUP_ITEMS,

    /**
     * kAutomatorWorkflowsFolderType
     */
    AUTOMATOR_WORKFLOWS,

    /**
     * kAutosaveInformationFolderType
     */
    AUTOSAVE_INFORMATION,

    /**
     * kSpotlightSavedSearchesFolderType
     */
    SPOTLIGHT_SAVED_SEARCHES,

    /**
     * kSpotlightImportersFolderType
     */
    SPOTLIGHT_IMPORTERS,

    /**
     * kSpotlightMetadataCacheFolderType
     */
    SPOTLIGHT_METADATA_CACHE,

    /**
     * kInputManagersFolderType
     */
    INPUT_MANAGERS,

    /**
     * kInputMethodsFolderType
     */
    INPUT_METHODS,

    /**
     * kLibraryAssistantsFolderType
     */
    LIBRARY_ASSISTANTS,

    /**
     * kAudioDigidesignFolderType
     */
    AUDIO_DIGIDESIGN,

    /**
     * kAudioVSTFolderType
     */
    AUDIO_VST,

    /**
     * kColorPickersFolderType
     */
    COLOR_PICKERS,

    /**
     * kCompositionsFolderType
     */
    COMPOSITIONS,

    /**
     * kFontCollectionsFolderType
     */
    FONT_COLLECTIONS,

    /**
     * kiMovieFolderType
     */
    I_MOVIE,

    /**
     * kiMoviePlugInsFolderType
     */
    I_MOVIE_PLUG_INS,

    /**
     * kiMovieSoundEffectsFolderType
     */
    I_MOVIE_SOUND_EFFECTS,

    /**
     * kDownloadsFolderType
     */
    DOWNLOADS,

    /**
     * kColorSyncProfilesFolderType
     */
    COLOR_SYNC_PROFILES,

    /**
     * kApplicationSupportFolderType
     */
    APPLICATION_SUPPORT,

    /**
     * kTextEncodingsFolderType
     */
    TEXT_ENCODINGS,

    /**
     * kPrinterDescriptionFolderType
     */
    PRINTER_DESCRIPTION,

    /**
     * kPrinterDriverFolderType
     */
    PRINTER_DRIVER,

    /**
     * kScriptingAdditionsFolderType
     */
    SCRIPTING_ADDITIONS,

    /**
     * kClassicPreferencesFolderType
     */
    CLASSIC_PREFERENCES,

    /**
     * kQuickLookFolderType
     */
    QUICK_LOOK,

    /**
     * kServicesFolderType
     */
    SERVICES

    // Omitted the Classic environment stuff because it isn't enabled in Mac OS X anymore.
}
