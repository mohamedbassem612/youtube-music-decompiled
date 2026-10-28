package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$LicenseRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yvo extends wlu {
    private final aihf a;

    public yvo(abxv abxvVar, zwb zwbVar, byte[] bArr, String str, String str2, boolean z, int i, boolean z2, String str3, String str4, boolean z3, Integer num, byte[] bArr2) {
        super("player/get_drm_license", abxvVar, zwbVar.e(), 1, true, null, null);
        aihf aihfVarCreateBuilder = InnertubeDrmService$LicenseRequest.a.createBuilder();
        this.a = aihfVarCreateBuilder;
        if (z3) {
            l(bArr2);
        } else {
            int i2 = zic.a;
            m();
        }
        boolean z4 = num != null;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest = (InnertubeDrmService$LicenseRequest) aihfVarCreateBuilder.instance;
        str.getClass();
        int i3 = 2;
        innertubeDrmService$LicenseRequest.b |= 2;
        innertubeDrmService$LicenseRequest.d = str;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest2 = (InnertubeDrmService$LicenseRequest) aihfVarCreateBuilder.instance;
        innertubeDrmService$LicenseRequest2.e = 1;
        innertubeDrmService$LicenseRequest2.b |= 4;
        zkf.d(bArr);
        aigj aigjVarV = aigj.v(bArr);
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest3 = (InnertubeDrmService$LicenseRequest) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        innertubeDrmService$LicenseRequest3.b |= 8;
        innertubeDrmService$LicenseRequest3.f = aigjVarV;
        zkf.d(str3);
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest4 = (InnertubeDrmService$LicenseRequest) aihfVarCreateBuilder.instance;
        str3.getClass();
        innertubeDrmService$LicenseRequest4.b |= 16;
        innertubeDrmService$LicenseRequest4.g = str3;
        zkf.d(str2);
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest5 = (InnertubeDrmService$LicenseRequest) aihfVarCreateBuilder.instance;
        innertubeDrmService$LicenseRequest5.b |= 32;
        innertubeDrmService$LicenseRequest5.h = str2;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest6 = (InnertubeDrmService$LicenseRequest) aihfVarCreateBuilder.instance;
        str4.getClass();
        innertubeDrmService$LicenseRequest6.b |= 64;
        innertubeDrmService$LicenseRequest6.i = str4;
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest7 = (InnertubeDrmService$LicenseRequest) aihfVarCreateBuilder.instance;
        innertubeDrmService$LicenseRequest7.b |= SemanticState.Focused;
        innertubeDrmService$LicenseRequest7.j = z4;
        if (!z && i == 1 && z2) {
            i3 = 3;
        }
        aihfVarCreateBuilder.copyOnWrite();
        InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest8 = (InnertubeDrmService$LicenseRequest) aihfVarCreateBuilder.instance;
        innertubeDrmService$LicenseRequest8.l = i3 - 1;
        innertubeDrmService$LicenseRequest8.b |= SemanticState.Multiline;
        if (num != null) {
            int iIntValue = num.intValue();
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeDrmService$LicenseRequest innertubeDrmService$LicenseRequest9 = (InnertubeDrmService$LicenseRequest) aihfVarCreateBuilder.instance;
            innertubeDrmService$LicenseRequest9.b |= SemanticState.Hidden;
            innertubeDrmService$LicenseRequest9.k = iIntValue;
        }
    }

    @Override // defpackage.wlu
    public final /* synthetic */ aiir a() {
        return this.a;
    }

    @Override // defpackage.wkf
    protected final void b() {
        zkf.c((((InnertubeDrmService$LicenseRequest) this.a.instance).b & 8) != 0);
    }
}
