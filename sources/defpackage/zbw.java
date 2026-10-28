package defpackage;

import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zbw {
    public zjv a;
    public String b;
    public MediaCapabilitiesOuterClass$MediaCapabilities c;
    private int d;
    private wgs e;
    private bse f;
    private boolean g;
    private byte h;

    public final zbx a() {
        zjv zjvVar;
        wgs wgsVar;
        String strB = txo.b(b().z());
        String strA = txo.a(b().z());
        zjv zjvVar2 = this.a;
        if (zjvVar2 == null) {
            throw new IllegalStateException("Property \"trackRendererType\" has not been set");
        }
        this.d = yno.ar(zjvVar2, false);
        int i = this.h | 1;
        this.h = (byte) i;
        String str = this.b;
        if ((i & 2) == 0) {
            throw new IllegalStateException("Property \"drcEnabled\" has not been set");
        }
        boolean z = this.g;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new bsg(null, str));
        }
        if (z) {
            arrayList.add(new bsg(null, "drc"));
        }
        bsd bsdVar = new bsd();
        bsdVar.a = "audio";
        bsdVar.d(arrayList);
        bsdVar.a(strB);
        bsdVar.e(bsy.c(strA));
        bsdVar.k = strA;
        bse bseVar = new bse(bsdVar);
        this.f = bseVar;
        if (this.h == 3 && (zjvVar = this.a) != null && (wgsVar = this.e) != null) {
            return new zbu(zjvVar, this.d, wgsVar, bseVar, this.b, this.g, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" trackRendererType");
        }
        if ((this.h & 1) == 0) {
            sb.append(" rendererIndexWithoutAudioOffload");
        }
        if (this.e == null) {
            sb.append(" compatibleFormatStream");
        }
        if (this.f == null) {
            sb.append(" exoFormat");
        }
        if ((this.h & 2) == 0) {
            sb.append(" drcEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final wgs b() {
        wgs wgsVar = this.e;
        if (wgsVar != null) {
            return wgsVar;
        }
        throw new IllegalStateException("Property \"compatibleFormatStream\" has not been set");
    }

    public final void c(wgs wgsVar) {
        if (wgsVar == null) {
            throw new NullPointerException("Null compatibleFormatStream");
        }
        this.e = wgsVar;
    }

    public final void d(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 2);
    }
}
