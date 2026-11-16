package io.github.iamwilmar.catherineport;

// What identifies this game in the user's files: the rest of the start screen is the same in every port.
// Lo que distingue a este juego en los archivos del usuario: el resto de la pantalla de inicio es igual en cada port.
final class Game {
    static final String NAME = "Catherine: Full Body";
    static final long APP_ID = 0x0100BF00112C0000L;
    // Versions are recognised by the build ID of the ExeFS main (bytes 0x40-0x53 of the NSO header). KNOWN_BUILDS:
    // {build ID, version, size of VERSION_FILE in that version's RomFS or null}. STRICT_VERSION: only those builds
    // (ports with address-specific patches); otherwise any build of the game is accepted with a notice.
    static final String VERSION = "1.0.0";
    static final String BUILD_ID = "868706e71adef5a6db27e593ebded0712a28da53";
    static final String[][] KNOWN_BUILDS = {{"868706e71adef5a6db27e593ebded0712a28da53", "1.0.0", "160982612"}};
    static final boolean STRICT_VERSION = false;
    static final String VERSION_FILE = "data/Patch.cpk";  // relative to the RomFS root (null: not checked)
    static final String ROMFS_MARKER = "data/Base.cpk";  // relative to the RomFS root
    static final String UPDATE_MARKER = null;  // only present with the update applied (null: not checked)
    static final String DLC_MARKER = null;  // in the root of each DLC RomFS (null: game without DLC)
    // Files the ExeFS folder must contain besides main and main.npdm (the game's own libraries, loaded as they are).
    static final String[] EXEFS_EXTRA = {"subsdk0"};

    private Game() {}
}
