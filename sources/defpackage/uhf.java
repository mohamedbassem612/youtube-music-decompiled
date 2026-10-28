package defpackage;

import com.google.protos.youtube.api.innertube.CompositionProto$Composition;
import j$.util.Optional;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uhf {
    public final String a;
    public int b;
    public final /* synthetic */ uhg c;
    private final long d;

    /* JADX WARN: Type inference failed for: r3v2, types: [awqg, java.lang.Object] */
    public uhf(uhg uhgVar, String str) {
        this.c = uhgVar;
        this.d = uhgVar.a.b();
        String strE = uhg.e(str);
        this.a = strE;
        File file = new File(strE);
        if (file.exists()) {
            file.length();
        }
        Optional optional = uhgVar.b;
        uhe uheVar = new uhe(new uhd(0), 0);
        optional.isPresent();
        uheVar.a.invoke(optional.get());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [awqg, java.lang.Object] */
    public final void a(CompositionProto$Composition compositionProto$Composition, Throwable th) {
        saa saaVar = new saa(new prq(19), 19);
        uhg uhgVar = this.c;
        Optional optional = uhgVar.b;
        optional.isPresent();
        saaVar.a.invoke(optional.get());
        String str = String.format(Locale.US, "Shorts Camera C2PA manifest embedding failed: duration=%dms, fileIngredients=%d, aiProvenances=%d, sanitizedIngredients=%d", Arrays.copyOf(new Object[]{Long.valueOf(uhgVar.a.b() - this.d), Integer.valueOf(uhg.d(compositionProto$Composition)), Integer.valueOf(uhg.c(compositionProto$Composition)), Integer.valueOf(this.b)}, 4));
        str.getClass();
        uhgVar.b(str, ajtv.ERROR_LEVEL_ERROR, th);
    }
}
