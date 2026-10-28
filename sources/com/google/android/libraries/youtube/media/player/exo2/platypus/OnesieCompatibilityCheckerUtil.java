package com.google.android.libraries.youtube.media.player.exo2.platypus;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class OnesieCompatibilityCheckerUtil {

    /* JADX INFO: compiled from: PG */
    abstract class AllowedFormatsCompatibilityCheck {
        AllowedFormatsCompatibilityCheck() {
        }
    }

    /* JADX INFO: compiled from: PG */
    abstract class LiveMetadataCompatibilityCheck {
        LiveMetadataCompatibilityCheck() {
        }
    }

    /* JADX INFO: compiled from: PG */
    class PlaybackStartTimeCompatibilityCheck {
    }

    static {
        Pattern.compile("[0-9a-zA-Z_-]{11}\\.[\\d]+\\~[\\d]+");
    }

    private OnesieCompatibilityCheckerUtil() {
    }
}
