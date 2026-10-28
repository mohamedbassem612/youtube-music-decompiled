package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgv implements cgw {
    private final Context a;
    private Boolean b;

    public cgv(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    @Override // defpackage.cgw
    public final cfl a(bse bseVar, brq brqVar) {
        int i;
        Boolean boolValueOf;
        boolean zBooleanValue;
        bseVar.getClass();
        brqVar.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = bseVar.K) == -1) {
            return cfl.a;
        }
        Context context = this.a;
        Boolean bool = this.b;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = ast.o(context).getParameters("offloadVariableRateSupported");
                boolValueOf = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.b = boolValueOf;
            } else {
                boolValueOf = Boolean.FALSE;
                this.b = boolValueOf;
            }
            zBooleanValue = boolValueOf.booleanValue();
        }
        String str = bseVar.q;
        str.getClass();
        int iA = bsy.a(str, bseVar.l);
        if (iA == 0 || Build.VERSION.SDK_INT < bwp.f(iA)) {
            return cfl.a;
        }
        int iH = bwp.h(bseVar);
        if (iH == 0) {
            return cfl.a;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iH).setEncoding(iA).build();
            if (Build.VERSION.SDK_INT >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, brqVar.a());
                if ((directPlaybackSupport & 1) == 0) {
                    return cfl.a;
                }
                z = (directPlaybackSupport & 3) == 3;
                cfk cfkVar = new cfk();
                cfkVar.a = true;
                cfkVar.b = z;
                cfkVar.c = zBooleanValue;
                return cfkVar.a();
            }
            if (Build.VERSION.SDK_INT < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, brqVar.a())) {
                    return cfl.a;
                }
                cfk cfkVar2 = new cfk();
                cfkVar2.a = true;
                cfkVar2.c = zBooleanValue;
                return cfkVar2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, brqVar.a());
            if (playbackOffloadSupport == 0) {
                return cfl.a;
            }
            cfk cfkVar3 = new cfk();
            if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            cfkVar3.a = true;
            cfkVar3.b = z;
            cfkVar3.c = zBooleanValue;
            return cfkVar3.a();
        } catch (IllegalArgumentException unused) {
            return cfl.a;
        }
    }
}
