package defpackage;

import android.os.Bundle;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uwq {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/editor/voiceover/VoiceoverState");
    public final Deque b;
    public final roq c;

    public uwq(cc ccVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.b = arrayDeque;
        roq roqVar = new roq(agpi.a);
        this.c = roqVar;
        dou savedStateRegistry = ccVar.getSavedStateRegistry();
        savedStateRegistry.b("VOICE_OVER_STATE_BUNDLE_KEY", new dos() { // from class: uwp
            @Override // defpackage.dos
            public final Bundle a() {
                Bundle bundle = new Bundle(1);
                ahng.aH(bundle, "VOICEOVER_SEGMENTS_KEY", this.a.a());
                return bundle;
            }
        });
        Bundle bundleA = savedStateRegistry.a("VOICE_OVER_STATE_BUNDLE_KEY");
        if (bundleA != null) {
            try {
                if (bundleA.containsKey("VOICEOVER_SEGMENTS_KEY")) {
                    List listAD = ahng.aD(bundleA, "VOICEOVER_SEGMENTS_KEY", auip.a, ExtensionRegistryLite.getGeneratedRegistry());
                    arrayDeque.clear();
                    arrayDeque.addAll(listAD);
                    roqVar.h(new uwk(this, 4));
                }
            } catch (aiik e) {
                ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/youtube/creation/editor/voiceover/VoiceoverState", "restoreStateFromBundle", (char) 244, "VoiceoverState.java")).t("restoreStateFromBundle of voiceoverSegments error");
            }
        }
    }

    public final agke a() {
        return agke.n(this.b);
    }
}
