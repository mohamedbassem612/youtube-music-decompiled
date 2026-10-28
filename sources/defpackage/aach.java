package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aach {
    public final amfl a;
    public final String b;
    public final Set c;
    public final Executor d;
    public aacg e;
    public String f;
    public int g;
    public final aaci h;
    private final int i;
    private final aeiy j;

    public aach(aeiy aeiyVar, Executor executor, String str, amfl amflVar, aaci aaciVar, int i) {
        this.f = str;
        this.a = amflVar;
        ahno.O((amflVar.b & 4) != 0);
        String strConcat = amflVar.e;
        if (!TextUtils.isEmpty(strConcat) && !strConcat.startsWith("/topics/")) {
            strConcat = "/topics/".concat(String.valueOf(strConcat));
        }
        strConcat.getClass();
        this.b = strConcat;
        this.h = aaciVar;
        this.c = new HashSet();
        this.g = 4;
        this.d = executor;
        this.j = aeiyVar;
        this.i = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [awmd, java.lang.Object] */
    private final aacg c(int i) {
        amfk amfkVar;
        String str = this.f;
        amfl amflVar = this.a;
        if ((amflVar.b & 32) != 0) {
            amfkVar = amflVar.f;
            if (amfkVar == null) {
                amfkVar = amfk.a;
            }
        } else {
            amfkVar = null;
        }
        amfk amfkVar2 = amfkVar;
        String str2 = this.b;
        aeiy aeiyVar = this.j;
        int i2 = this.i;
        syn synVar = (syn) aeiyVar.c.io();
        synVar.getClass();
        tfq tfqVar = (tfq) aeiyVar.f.io();
        tfqVar.getClass();
        tbt tbtVar = (tbt) aeiyVar.b.io();
        tbtVar.getClass();
        Executor executor = (Executor) aeiyVar.g.io();
        executor.getClass();
        vyo vyoVar = (vyo) aeiyVar.d.io();
        vyoVar.getClass();
        xsc xscVar = (xsc) aeiyVar.e.io();
        xscVar.getClass();
        str.getClass();
        return new aacg(aeiyVar.a, synVar, tfqVar, tbtVar, executor, vyoVar, xscVar, aeiyVar.h, this, str, str2, i, amfkVar2, i2);
    }

    public final void a() {
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        this.g = 1;
        aacg aacgVarC = c(1);
        this.e = aacgVarC;
        aacgVarC.f();
    }

    public final void b() {
        this.g = 3;
        aacg aacgVarC = c(2);
        this.e = aacgVarC;
        aacgVarC.f();
    }
}
