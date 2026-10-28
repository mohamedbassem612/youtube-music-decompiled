package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import defpackage.a;
import defpackage.brt;
import defpackage.brz;
import defpackage.bsa;
import defpackage.jtp;
import defpackage.jtr;
import defpackage.xur;
import defpackage.zkf;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class MatroskaTagExtractor extends jtr {
    private final xur I;
    private final ArrayDeque H = new ArrayDeque();
    String G = null;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    final class SimpleTag {
        public String a;
        public String b;
    }

    public MatroskaTagExtractor(xur xurVar) {
        this.I = xurVar;
    }

    @Override // defpackage.jtr, defpackage.cvi
    public final void d(long j, long j2) {
        this.H.clear();
        super.d(j, j2);
    }

    @Override // defpackage.jtr
    public final int i(int i) {
        if (i == 17543 || i == 17827) {
            return 3;
        }
        if (i == 26568 || i == 29555 || i == 307544935) {
            return 1;
        }
        return super.i(i);
    }

    @Override // defpackage.jtr
    protected final void m(int i) {
        String str;
        if (i == 26568) {
            SimpleTag simpleTag = (SimpleTag) this.H.removeFirst();
            String str2 = simpleTag.a;
            if (str2 != null && (str = simpleTag.b) != null) {
                this.I.c(str2, str);
                if (simpleTag.b.contains("Crypto-Period-Index")) {
                    this.G = simpleTag.b;
                }
            }
            i = 26568;
        }
        super.m(i);
        if (i == 25152) {
            String str3 = this.G;
            jtp jtpVar = this.l;
            if (str3 == null || jtpVar == null) {
                return;
            }
            jtpVar.k = new bsa(null, true, new brz(brt.a, null, "video/webm", a.N(str3).getBytes(StandardCharsets.UTF_8)));
            this.G = null;
        }
    }

    @Override // defpackage.jtr
    protected final void n(int i, long j, long j2) {
        if (i == 26568) {
            this.H.addFirst(new SimpleTag());
            i = 26568;
        }
        super.n(i, j, j2);
    }

    @Override // defpackage.jtr
    protected final void o(int i, String str) {
        SimpleTag simpleTag = (SimpleTag) this.H.peekFirst();
        if (i == 17827) {
            zkf.d(simpleTag);
            simpleTag.a = str;
        } else if (i == 17543) {
            zkf.d(simpleTag);
            simpleTag.b = str;
            i = 17543;
        }
        super.o(i, str);
    }
}
