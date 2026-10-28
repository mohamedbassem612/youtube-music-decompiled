package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wll implements wmg {
    public final awmd a;
    public final mbc b;
    public final tqj c;
    public final awmd d;
    public final wli[] e;
    public final wlj f;
    public final wlj g;
    public final wlk h;
    public int i;
    boolean j;
    public final ayq k;
    private final awmd l;
    private final awmd m;
    private final awmd n;
    private final ReentrantLock o = new ReentrantLock();

    public wll(awmd awmdVar, mbc mbcVar, awmd awmdVar2, tqj tqjVar, ayq ayqVar, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        int iA;
        this.a = awmdVar;
        this.m = awmdVar4;
        this.b = mbcVar;
        this.d = awmdVar2;
        this.c = tqjVar;
        this.k = ayqVar;
        this.l = awmdVar3;
        this.n = awmdVar5;
        if (tqjVar != null) {
            int i = tqr.a;
            iA = tqjVar.a(656128);
        } else {
            iA = 0;
        }
        this.i = iA;
        wlj wljVar = new wlj(this, new qmd(19), new qmd(20), new qmd(14), ajvu.a, (byte) 1, false);
        this.g = wljVar;
        wlj wljVar2 = new wlj(this, new qmd(15), new qmd(16), new qmd(17), alik.a, (byte) 2, true);
        this.f = wljVar2;
        wlk wlkVar = new wlk(wljVar.r, new qmd(18), ajbd.a, wljVar);
        wljVar.o.add(wlkVar);
        this.h = wlkVar;
        this.e = new wli[]{wlkVar, wljVar, wljVar2};
        if ((this.i & 4) == 0 && awmdVar2 != null) {
            ((tbt) awmdVar2.io()).f(this);
        }
        boolean z = vyl.c.b;
    }

    public static ajbd e(ajvu ajvuVar) {
        anhb anhbVar = ajvuVar.j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        ajbd ajbdVar = anhbVar.l;
        return ajbdVar == null ? ajbd.a : ajbdVar;
    }

    public static void h(String str, Throwable th) {
        t(zvn.b, str, th);
    }

    private final long q() {
        return this.b.f().toEpochMilli();
    }

    private final SharedPreferences.Editor r(SharedPreferences.Editor editor) {
        x("->bin");
        this.j = !w();
        return editor.remove("com.google.android.libraries.youtube.innertube.cold_config_group").remove("com.google.android.libraries.youtube.innertube.cold_stored_timestamp").remove("com.google.android.libraries.youtube.innertube.cold_hash_data").remove("com.google.android.libraries.youtube.innertube.hot_config_group").remove("com.google.android.libraries.youtube.innertube.hot_stored_timestamp").remove("com.google.android.libraries.youtube.innertube.hot_hash_data");
    }

    private final void s() {
        this.f.a = "";
    }

    private static void t(zvn zvnVar, String str, Throwable th) {
        String strZ = ahno.Z(str);
        if (th == null) {
            zvp.a(zvnVar, zvm.s, strZ);
        } else {
            zvp.b(zvnVar, zvm.s, strZ, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025a A[Catch: all -> 0x027e, TRY_LEAVE, TryCatch #5 {, blocks: (B:65:0x0097, B:67:0x00b0, B:69:0x00f0, B:70:0x012d, B:72:0x0136, B:74:0x0144, B:76:0x0148, B:77:0x014b, B:79:0x014f, B:81:0x015c, B:90:0x0175, B:104:0x01d4, B:120:0x0226, B:121:0x0252, B:123:0x025a, B:91:0x0184, B:92:0x0194, B:93:0x0195, B:94:0x019e, B:95:0x019f, B:96:0x01ae, B:97:0x01af, B:99:0x01bb, B:101:0x01c1, B:103:0x01c7, B:105:0x01db, B:106:0x01ea, B:107:0x01eb, B:108:0x01f4, B:109:0x01f5, B:110:0x0202, B:111:0x0203, B:112:0x0212, B:113:0x0213, B:114:0x021c, B:68:0x00b7), top: B:161:0x0097, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0264 A[Catch: IOException -> 0x0281, TryCatch #3 {IOException -> 0x0281, blocks: (B:63:0x0088, B:64:0x0096, B:124:0x025e, B:127:0x0264, B:129:0x0268, B:130:0x0277, B:134:0x027f, B:135:0x0280, B:65:0x0097, B:67:0x00b0, B:69:0x00f0, B:70:0x012d, B:72:0x0136, B:74:0x0144, B:76:0x0148, B:77:0x014b, B:79:0x014f, B:81:0x015c, B:90:0x0175, B:104:0x01d4, B:120:0x0226, B:121:0x0252, B:123:0x025a, B:91:0x0184, B:92:0x0194, B:93:0x0195, B:94:0x019e, B:95:0x019f, B:96:0x01ae, B:97:0x01af, B:99:0x01bb, B:101:0x01c1, B:103:0x01c7, B:105:0x01db, B:106:0x01ea, B:107:0x01eb, B:108:0x01f4, B:109:0x01f5, B:110:0x0202, B:111:0x0203, B:112:0x0212, B:113:0x0213, B:114:0x021c, B:68:0x00b7), top: B:159:0x0088, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0268 A[Catch: IOException -> 0x0281, TryCatch #3 {IOException -> 0x0281, blocks: (B:63:0x0088, B:64:0x0096, B:124:0x025e, B:127:0x0264, B:129:0x0268, B:130:0x0277, B:134:0x027f, B:135:0x0280, B:65:0x0097, B:67:0x00b0, B:69:0x00f0, B:70:0x012d, B:72:0x0136, B:74:0x0144, B:76:0x0148, B:77:0x014b, B:79:0x014f, B:81:0x015c, B:90:0x0175, B:104:0x01d4, B:120:0x0226, B:121:0x0252, B:123:0x025a, B:91:0x0184, B:92:0x0194, B:93:0x0195, B:94:0x019e, B:95:0x019f, B:96:0x01ae, B:97:0x01af, B:99:0x01bb, B:101:0x01c1, B:103:0x01c7, B:105:0x01db, B:106:0x01ea, B:107:0x01eb, B:108:0x01f4, B:109:0x01f5, B:110:0x0202, B:111:0x0203, B:112:0x0212, B:113:0x0213, B:114:0x021c, B:68:0x00b7), top: B:159:0x0088, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x027c  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:175:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        if (r2.b == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void u(defpackage.ajvu r21, defpackage.alik r22) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wll.u(ajvu, alik):void");
    }

    private final void v() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.a.io();
        ajvu ajvuVar = null;
        String string = sharedPreferences.getString("com.google.android.libraries.youtube.innertube.cold_config_group", null);
        long j = -1;
        long j2 = sharedPreferences.getLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", -1L);
        if (!TextUtils.isEmpty(string)) {
            ajvu ajvuVar2 = ajvu.a;
            ajvuVar = (ajvu) zik.ce(string, aihn.getParserForClass(ajvu.class), b(32));
        }
        if (ajvuVar == null) {
            ajvuVar = ajvu.a;
        } else {
            j = j2;
        }
        wlj wljVar = this.g;
        wljVar.c = j;
        wljVar.b = j;
        wljVar.a = sharedPreferences.getString("com.google.android.libraries.youtube.innertube.cold_hash_data", "");
        wljVar.f = ajvuVar;
        wlk wlkVar = this.h;
        wlkVar.c = j;
        wlkVar.b = j;
        wlkVar.a = wljVar.a;
        anhb anhbVar = ajvuVar.j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        ajbd ajbdVar = anhbVar.l;
        if (ajbdVar == null) {
            ajbdVar = ajbd.a;
        }
        wlkVar.f = ajbdVar;
    }

    private final boolean w() {
        try {
            File fileF = f("cg.pb");
            File fileF2 = f("cg.pb.new");
            try {
                OutputStream outputStreamS = tym.s(fileF2);
                try {
                    outputStreamS.write(255);
                    outputStreamS.write(255);
                    outputStreamS.write(255);
                    outputStreamS.write(1);
                    wli[] wliVarArr = this.e;
                    int length = wliVarArr.length;
                    for (int i = 0; i < 3; i++) {
                        wli wliVar = wliVarArr[i];
                        aihf aihfVarCreateBuilder = ajlm.a.createBuilder();
                        String str = wliVar.a;
                        aihfVarCreateBuilder.copyOnWrite();
                        ajlm ajlmVar = (ajlm) aihfVarCreateBuilder.instance;
                        str.getClass();
                        ajlmVar.b |= 2;
                        ajlmVar.d = str;
                        long j = wliVar.b;
                        aihfVarCreateBuilder.copyOnWrite();
                        ajlm ajlmVar2 = (ajlm) aihfVarCreateBuilder.instance;
                        ajlmVar2.b |= 1;
                        ajlmVar2.c = j;
                        ajlm ajlmVar3 = (ajlm) aihfVarCreateBuilder.build();
                        outputStreamS.write(wliVar.h);
                        wlh.b(outputStreamS, ajlmVar3);
                        MessageLite messageLiteEm = wliVar.f;
                        if (messageLiteEm instanceof ajvu) {
                            messageLiteEm = yno.ek((ajvu) messageLiteEm);
                        } else if (messageLiteEm instanceof alik) {
                            messageLiteEm = yno.em((alik) messageLiteEm);
                        }
                        wlh.b(outputStreamS, messageLiteEm);
                    }
                    outputStreamS.close();
                    return tym.p(fileF2, fileF, new aesu(1));
                } catch (Throwable th) {
                    try {
                        outputStreamS.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                h("!write", e);
                tym.n(fileF2, new aesu(1));
                return false;
            }
        } catch (Exception e2) {
            h("!file", e2);
            return false;
        }
    }

    private static void x(String str) {
        t(zvn.a, str, null);
    }

    @Override // defpackage.wmg
    public final void a(alop alopVar) {
        throw null;
    }

    public final ExtensionRegistryLite b(int i) {
        boolean z = vyl.c.b;
        return (this.i & i) != 0 ? ExtensionRegistryLite.a : ExtensionRegistryLite.getGeneratedRegistry();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e4 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01fb A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0209 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[Catch: all -> 0x00a2, TryCatch #1 {all -> 0x00a2, blocks: (B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:119:0x005a, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[Catch: all -> 0x00a2, TryCatch #1 {all -> 0x00a2, blocks: (B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:119:0x005a, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0094 A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00be A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7 A[Catch: all -> 0x021f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x013a A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x013f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0141 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0160 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0175 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x017c A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0198 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x019a A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01bd A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c4 A[Catch: all -> 0x021f, TryCatch #3 {all -> 0x021f, blocks: (B:15:0x0032, B:17:0x0039, B:19:0x003d, B:20:0x003f, B:24:0x0057, B:34:0x0071, B:36:0x007f, B:37:0x008a, B:39:0x0090, B:40:0x0094, B:44:0x00a3, B:45:0x00ad, B:46:0x00ae, B:48:0x00be, B:49:0x00c0, B:51:0x00c8, B:52:0x00d1, B:54:0x00d9, B:55:0x00e6, B:57:0x00ea, B:58:0x00ec, B:61:0x00f7, B:62:0x00fb, B:74:0x013a, B:80:0x0171, B:82:0x0175, B:83:0x0177, B:85:0x017c, B:86:0x0180, B:96:0x01bd, B:102:0x01f5, B:104:0x01fb, B:105:0x01ff, B:107:0x0209, B:108:0x0218, B:98:0x01c4, B:100:0x01e4, B:101:0x01e8, B:89:0x0192, B:91:0x019a, B:92:0x019f, B:94:0x01a5, B:76:0x0141, B:78:0x0160, B:79:0x0164, B:65:0x010d, B:68:0x0116, B:70:0x011c, B:72:0x0122, B:25:0x005a, B:27:0x005e, B:29:0x0064, B:31:0x0068, B:33:0x006e), top: B:123:0x0032, inners: #0, #1, #2 }] */
    @Override // defpackage.wmg
    public final void c(wlu wluVar, alop alopVar, zwa zwaVar) {
        SharedPreferences.Editor editorEdit;
        alei aleiVar;
        String str;
        String str2;
        alei aleiVar2;
        int i;
        String str3;
        String strCg;
        alik alikVar;
        alei aleiVar3;
        int i2;
        String str4;
        String strCg2;
        ajvu ajvuVar;
        ayq ayqVar;
        ReentrantLock reentrantLock;
        alei aleiVar4;
        wlj wljVar;
        wlj wljVar2;
        ajvu ajvuVar2;
        alik alikVar2;
        wlj wljVar3;
        wlj wljVar4;
        ayq ayqVar2;
        if ((alopVar.b & 16384) != 0) {
            awmd awmdVar = this.n;
            if (awmdVar != null) {
                String strK = zwaVar.k();
                zwa zwaVarE = ((zwb) awmdVar.io()).e();
                if (Objects.equals(strK, zwaVarE == null ? null : zwaVarE.k())) {
                    if ((alopVar.b & 16384) != 0) {
                        this.o.lock();
                        try {
                            if (n()) {
                                aleiVar4 = alopVar.g;
                                if (aleiVar4 == null) {
                                    aleiVar4 = alei.a;
                                }
                                long jQ = q();
                                wljVar = this.g;
                                boolean zE = wljVar.e(aleiVar4, jQ);
                                wljVar2 = this.f;
                                boolean zE2 = wljVar2.e(aleiVar4, jQ);
                                if (this.j || zE || zE2) {
                                    vyl.c();
                                    try {
                                        if (wljVar.q) {
                                            ajvuVar2 = (ajvu) wljVar.p;
                                        } else {
                                            ajvuVar2 = null;
                                        }
                                        if (wljVar2.q) {
                                            alikVar2 = (alik) wljVar2.p;
                                        } else {
                                            alikVar2 = null;
                                        }
                                        u(ajvuVar2, alikVar2);
                                        wljVar3 = this.g;
                                        wljVar3.d();
                                        wljVar4 = this.f;
                                        wljVar4.d();
                                        ayqVar2 = this.k;
                                        if (ayqVar2 != null) {
                                            ayqVar2.K((ajvu) wljVar3.f, (alik) wljVar4.f);
                                        }
                                        if (p()) {
                                            m();
                                        } else {
                                            this.j = !w();
                                        }
                                    } catch (Throwable th) {
                                        this.g.d();
                                        this.f.d();
                                        throw th;
                                    }
                                }
                                reentrantLock = this.o;
                            } else {
                                editorEdit = ((SharedPreferences) this.a.io()).edit();
                                aleiVar = alopVar.g;
                                if (aleiVar == null) {
                                    aleiVar = alei.a;
                                }
                                str = aleiVar.k;
                                if (!TextUtils.isEmpty(str)) {
                                    this.f.a = str;
                                    editorEdit.putString("com.google.android.libraries.youtube.innertube.hot_hash_data", str);
                                }
                                str2 = aleiVar.l;
                                if (!TextUtils.isEmpty(str2)) {
                                    wlj wljVar5 = this.g;
                                    this.h.a = str2;
                                    wljVar5.a = str2;
                                    editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_hash_data", str2);
                                }
                                aleiVar2 = alopVar.g;
                                if (aleiVar2 == null) {
                                    aleiVar2 = alei.a;
                                }
                                i = aleiVar2.d;
                                if (i == 7) {
                                    aigj aigjVar = (aigj) aleiVar2.e;
                                    try {
                                        alikVar = (alik) aihn.parseFrom(alik.a, aigjVar);
                                        strCg = Base64.encodeToString(aigjVar.G(), 8);
                                        if (alikVar == null) {
                                            h("SP null hotcfg", null);
                                            alikVar = null;
                                        } else {
                                            wlj wljVar6 = this.f;
                                            alik alikVarEl = yno.el(alikVar, (alik) wljVar6.f);
                                            wljVar6.f = alikVarEl;
                                            long jQ2 = q();
                                            wljVar6.c = jQ2;
                                            wljVar6.b = jQ2;
                                            wljVar6.j.kk(alikVarEl);
                                            if (yno.eq(alikVar)) {
                                                strCg = yno.eo(alikVar);
                                            }
                                            editorEdit.putString("com.google.android.libraries.youtube.innertube.hot_config_group", strCg).putLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", wljVar6.b);
                                        }
                                    } catch (aiik e) {
                                        h("SP Failed BytesSerializedHot", e);
                                    }
                                    aleiVar3 = alopVar.g;
                                    if (aleiVar3 == null) {
                                        aleiVar3 = alei.a;
                                    }
                                    i2 = aleiVar3.b;
                                    if (i2 == 6) {
                                        aigj aigjVar2 = (aigj) aleiVar3.c;
                                        try {
                                            ajvuVar = (ajvu) aihn.parseFrom(ajvu.a, aigjVar2);
                                            strCg2 = Base64.encodeToString(aigjVar2.G(), 8);
                                            if (ajvuVar == null) {
                                                h("SP null coldcfg", null);
                                            } else {
                                                wlj wljVar7 = this.g;
                                                wljVar7.f = ajvuVar;
                                                wljVar7.b = q();
                                                wlk wlkVar = this.h;
                                                wlkVar.f = e((ajvu) wljVar7.f);
                                                wlkVar.b = wljVar7.b;
                                                if (yno.ep(ajvuVar)) {
                                                    strCg2 = yno.en(ajvuVar);
                                                }
                                                editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_config_group", strCg2).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", wljVar7.b);
                                            }
                                        } catch (aiik e2) {
                                            h("SP Failed BytesSerializedCold", e2);
                                        }
                                        if (p()) {
                                            editorEdit = r(editorEdit);
                                        }
                                        vyl.c();
                                        u(ajvuVar, alikVar);
                                        ayqVar = this.k;
                                        if (ayqVar != null) {
                                            ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                                        }
                                        editorEdit.apply();
                                        reentrantLock = this.o;
                                    } else {
                                        str4 = i2 == 1 ? (String) aleiVar3.c : "";
                                        if (!TextUtils.isEmpty(str4)) {
                                            strCg2 = zik.cg(str4);
                                            ajvu ajvuVar3 = ajvu.a;
                                            ajvuVar = (ajvu) zik.ce(strCg2, aihn.getParserForClass(ajvu.class), b(32));
                                            if (ajvuVar == null) {
                                                h("SP null coldcfg", null);
                                            } else {
                                                wlj wljVar8 = this.g;
                                                wljVar8.f = ajvuVar;
                                                wljVar8.b = q();
                                                wlk wlkVar2 = this.h;
                                                wlkVar2.f = e((ajvu) wljVar8.f);
                                                wlkVar2.b = wljVar8.b;
                                                if (yno.ep(ajvuVar)) {
                                                    strCg2 = yno.en(ajvuVar);
                                                }
                                                editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_config_group", strCg2).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", wljVar8.b);
                                            }
                                        }
                                        if (p()) {
                                            editorEdit = r(editorEdit);
                                        }
                                        vyl.c();
                                        u(ajvuVar, alikVar);
                                        ayqVar = this.k;
                                        if (ayqVar != null) {
                                            ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                                        }
                                        editorEdit.apply();
                                        reentrantLock = this.o;
                                    }
                                    ajvuVar = null;
                                    if (p()) {
                                        editorEdit = r(editorEdit);
                                    }
                                    vyl.c();
                                    u(ajvuVar, alikVar);
                                    ayqVar = this.k;
                                    if (ayqVar != null) {
                                        ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                                    }
                                    editorEdit.apply();
                                    reentrantLock = this.o;
                                } else {
                                    if (i == 3) {
                                        str3 = (String) aleiVar2.e;
                                    } else {
                                        str3 = "";
                                    }
                                    if (TextUtils.isEmpty(str3)) {
                                        alikVar = null;
                                    } else {
                                        strCg = zik.cg(str3);
                                        alik alikVar3 = alik.a;
                                        alikVar = (alik) zik.ce(strCg, aihn.getParserForClass(alik.class), b(32));
                                        if (alikVar == null) {
                                            h("SP null hotcfg", null);
                                            alikVar = null;
                                        } else {
                                            wlj wljVar9 = this.f;
                                            alik alikVarEl2 = yno.el(alikVar, (alik) wljVar9.f);
                                            wljVar9.f = alikVarEl2;
                                            long jQ3 = q();
                                            wljVar9.c = jQ3;
                                            wljVar9.b = jQ3;
                                            wljVar9.j.kk(alikVarEl2);
                                            if (yno.eq(alikVar)) {
                                                strCg = yno.eo(alikVar);
                                            }
                                            editorEdit.putString("com.google.android.libraries.youtube.innertube.hot_config_group", strCg).putLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", wljVar9.b);
                                        }
                                    }
                                    aleiVar3 = alopVar.g;
                                    if (aleiVar3 == null) {
                                        aleiVar3 = alei.a;
                                    }
                                    i2 = aleiVar3.b;
                                    if (i2 == 6) {
                                        aigj aigjVar3 = (aigj) aleiVar3.c;
                                        ajvuVar = (ajvu) aihn.parseFrom(ajvu.a, aigjVar3);
                                        strCg2 = Base64.encodeToString(aigjVar3.G(), 8);
                                        if (ajvuVar == null) {
                                            h("SP null coldcfg", null);
                                        } else {
                                            wlj wljVar10 = this.g;
                                            wljVar10.f = ajvuVar;
                                            wljVar10.b = q();
                                            wlk wlkVar3 = this.h;
                                            wlkVar3.f = e((ajvu) wljVar10.f);
                                            wlkVar3.b = wljVar10.b;
                                            if (yno.ep(ajvuVar)) {
                                                strCg2 = yno.en(ajvuVar);
                                            }
                                            editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_config_group", strCg2).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", wljVar10.b);
                                        }
                                        if (p()) {
                                            editorEdit = r(editorEdit);
                                        }
                                        vyl.c();
                                        u(ajvuVar, alikVar);
                                        ayqVar = this.k;
                                        if (ayqVar != null) {
                                            ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                                        }
                                        editorEdit.apply();
                                        reentrantLock = this.o;
                                    } else {
                                        if (i2 == 1) {
                                        }
                                        if (!TextUtils.isEmpty(str4)) {
                                            strCg2 = zik.cg(str4);
                                            ajvu ajvuVar4 = ajvu.a;
                                            ajvuVar = (ajvu) zik.ce(strCg2, aihn.getParserForClass(ajvu.class), b(32));
                                            if (ajvuVar == null) {
                                                h("SP null coldcfg", null);
                                            } else {
                                                wlj wljVar11 = this.g;
                                                wljVar11.f = ajvuVar;
                                                wljVar11.b = q();
                                                wlk wlkVar4 = this.h;
                                                wlkVar4.f = e((ajvu) wljVar11.f);
                                                wlkVar4.b = wljVar11.b;
                                                if (yno.ep(ajvuVar)) {
                                                    strCg2 = yno.en(ajvuVar);
                                                }
                                                editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_config_group", strCg2).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", wljVar11.b);
                                            }
                                        }
                                        if (p()) {
                                            editorEdit = r(editorEdit);
                                        }
                                        vyl.c();
                                        u(ajvuVar, alikVar);
                                        ayqVar = this.k;
                                        if (ayqVar != null) {
                                            ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                                        }
                                        editorEdit.apply();
                                        reentrantLock = this.o;
                                    }
                                    ajvuVar = null;
                                    if (p()) {
                                        editorEdit = r(editorEdit);
                                    }
                                    vyl.c();
                                    u(ajvuVar, alikVar);
                                    ayqVar = this.k;
                                    if (ayqVar != null) {
                                        ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                                    }
                                    editorEdit.apply();
                                    reentrantLock = this.o;
                                }
                            }
                            reentrantLock.unlock();
                        } catch (Throwable th2) {
                            this.o.unlock();
                            throw th2;
                        }
                    }
                }
            } else if ((alopVar.b & 16384) != 0) {
                this.o.lock();
                if (n()) {
                    aleiVar4 = alopVar.g;
                    if (aleiVar4 == null) {
                        aleiVar4 = alei.a;
                    }
                    long jQ4 = q();
                    wljVar = this.g;
                    boolean zE3 = wljVar.e(aleiVar4, jQ4);
                    wljVar2 = this.f;
                    boolean zE4 = wljVar2.e(aleiVar4, jQ4);
                    if (this.j) {
                        vyl.c();
                        if (wljVar.q) {
                            ajvuVar2 = (ajvu) wljVar.p;
                        } else {
                            ajvuVar2 = null;
                        }
                        if (wljVar2.q) {
                            alikVar2 = (alik) wljVar2.p;
                        } else {
                            alikVar2 = null;
                        }
                        u(ajvuVar2, alikVar2);
                        wljVar3 = this.g;
                        wljVar3.d();
                        wljVar4 = this.f;
                        wljVar4.d();
                        ayqVar2 = this.k;
                        if (ayqVar2 != null) {
                            ayqVar2.K((ajvu) wljVar3.f, (alik) wljVar4.f);
                        }
                        if (p()) {
                            m();
                        } else {
                            this.j = !w();
                        }
                        reentrantLock = this.o;
                    } else {
                        vyl.c();
                        if (wljVar.q) {
                            ajvuVar2 = (ajvu) wljVar.p;
                        } else {
                            ajvuVar2 = null;
                        }
                        if (wljVar2.q) {
                            alikVar2 = (alik) wljVar2.p;
                        } else {
                            alikVar2 = null;
                        }
                        u(ajvuVar2, alikVar2);
                        wljVar3 = this.g;
                        wljVar3.d();
                        wljVar4 = this.f;
                        wljVar4.d();
                        ayqVar2 = this.k;
                        if (ayqVar2 != null) {
                            ayqVar2.K((ajvu) wljVar3.f, (alik) wljVar4.f);
                        }
                        if (p()) {
                            m();
                        } else {
                            this.j = !w();
                        }
                        reentrantLock = this.o;
                    }
                } else {
                    editorEdit = ((SharedPreferences) this.a.io()).edit();
                    aleiVar = alopVar.g;
                    if (aleiVar == null) {
                        aleiVar = alei.a;
                    }
                    str = aleiVar.k;
                    if (!TextUtils.isEmpty(str)) {
                        this.f.a = str;
                        editorEdit.putString("com.google.android.libraries.youtube.innertube.hot_hash_data", str);
                    }
                    str2 = aleiVar.l;
                    if (!TextUtils.isEmpty(str2)) {
                        wlj wljVar12 = this.g;
                        this.h.a = str2;
                        wljVar12.a = str2;
                        editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_hash_data", str2);
                    }
                    aleiVar2 = alopVar.g;
                    if (aleiVar2 == null) {
                        aleiVar2 = alei.a;
                    }
                    i = aleiVar2.d;
                    if (i == 7) {
                        aigj aigjVar4 = (aigj) aleiVar2.e;
                        alikVar = (alik) aihn.parseFrom(alik.a, aigjVar4);
                        strCg = Base64.encodeToString(aigjVar4.G(), 8);
                        if (alikVar == null) {
                            h("SP null hotcfg", null);
                            alikVar = null;
                        } else {
                            wlj wljVar13 = this.f;
                            alik alikVarEl3 = yno.el(alikVar, (alik) wljVar13.f);
                            wljVar13.f = alikVarEl3;
                            long jQ5 = q();
                            wljVar13.c = jQ5;
                            wljVar13.b = jQ5;
                            wljVar13.j.kk(alikVarEl3);
                            if (yno.eq(alikVar)) {
                                strCg = yno.eo(alikVar);
                            }
                            editorEdit.putString("com.google.android.libraries.youtube.innertube.hot_config_group", strCg).putLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", wljVar13.b);
                        }
                        aleiVar3 = alopVar.g;
                        if (aleiVar3 == null) {
                            aleiVar3 = alei.a;
                        }
                        i2 = aleiVar3.b;
                        if (i2 == 6) {
                            aigj aigjVar5 = (aigj) aleiVar3.c;
                            ajvuVar = (ajvu) aihn.parseFrom(ajvu.a, aigjVar5);
                            strCg2 = Base64.encodeToString(aigjVar5.G(), 8);
                            if (ajvuVar == null) {
                                h("SP null coldcfg", null);
                            } else {
                                wlj wljVar14 = this.g;
                                wljVar14.f = ajvuVar;
                                wljVar14.b = q();
                                wlk wlkVar5 = this.h;
                                wlkVar5.f = e((ajvu) wljVar14.f);
                                wlkVar5.b = wljVar14.b;
                                if (yno.ep(ajvuVar)) {
                                    strCg2 = yno.en(ajvuVar);
                                }
                                editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_config_group", strCg2).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", wljVar14.b);
                            }
                            if (p()) {
                                editorEdit = r(editorEdit);
                            }
                            vyl.c();
                            u(ajvuVar, alikVar);
                            ayqVar = this.k;
                            if (ayqVar != null) {
                                ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                            }
                            editorEdit.apply();
                            reentrantLock = this.o;
                        } else {
                            if (i2 == 1) {
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                strCg2 = zik.cg(str4);
                                ajvu ajvuVar5 = ajvu.a;
                                ajvuVar = (ajvu) zik.ce(strCg2, aihn.getParserForClass(ajvu.class), b(32));
                                if (ajvuVar == null) {
                                    h("SP null coldcfg", null);
                                } else {
                                    wlj wljVar15 = this.g;
                                    wljVar15.f = ajvuVar;
                                    wljVar15.b = q();
                                    wlk wlkVar6 = this.h;
                                    wlkVar6.f = e((ajvu) wljVar15.f);
                                    wlkVar6.b = wljVar15.b;
                                    if (yno.ep(ajvuVar)) {
                                        strCg2 = yno.en(ajvuVar);
                                    }
                                    editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_config_group", strCg2).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", wljVar15.b);
                                }
                            }
                            if (p()) {
                                editorEdit = r(editorEdit);
                            }
                            vyl.c();
                            u(ajvuVar, alikVar);
                            ayqVar = this.k;
                            if (ayqVar != null) {
                                ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                            }
                            editorEdit.apply();
                            reentrantLock = this.o;
                        }
                        ajvuVar = null;
                        if (p()) {
                            editorEdit = r(editorEdit);
                        }
                        vyl.c();
                        u(ajvuVar, alikVar);
                        ayqVar = this.k;
                        if (ayqVar != null) {
                            ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                        }
                        editorEdit.apply();
                        reentrantLock = this.o;
                    } else {
                        if (i == 3) {
                            str3 = (String) aleiVar2.e;
                        } else {
                            str3 = "";
                        }
                        if (TextUtils.isEmpty(str3)) {
                            strCg = zik.cg(str3);
                            alik alikVar4 = alik.a;
                            alikVar = (alik) zik.ce(strCg, aihn.getParserForClass(alik.class), b(32));
                            if (alikVar == null) {
                                h("SP null hotcfg", null);
                                alikVar = null;
                            } else {
                                wlj wljVar16 = this.f;
                                alik alikVarEl4 = yno.el(alikVar, (alik) wljVar16.f);
                                wljVar16.f = alikVarEl4;
                                long jQ6 = q();
                                wljVar16.c = jQ6;
                                wljVar16.b = jQ6;
                                wljVar16.j.kk(alikVarEl4);
                                if (yno.eq(alikVar)) {
                                    strCg = yno.eo(alikVar);
                                }
                                editorEdit.putString("com.google.android.libraries.youtube.innertube.hot_config_group", strCg).putLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", wljVar16.b);
                            }
                        } else {
                            alikVar = null;
                        }
                        aleiVar3 = alopVar.g;
                        if (aleiVar3 == null) {
                            aleiVar3 = alei.a;
                        }
                        i2 = aleiVar3.b;
                        if (i2 == 6) {
                            aigj aigjVar6 = (aigj) aleiVar3.c;
                            ajvuVar = (ajvu) aihn.parseFrom(ajvu.a, aigjVar6);
                            strCg2 = Base64.encodeToString(aigjVar6.G(), 8);
                            if (ajvuVar == null) {
                                h("SP null coldcfg", null);
                            } else {
                                wlj wljVar17 = this.g;
                                wljVar17.f = ajvuVar;
                                wljVar17.b = q();
                                wlk wlkVar7 = this.h;
                                wlkVar7.f = e((ajvu) wljVar17.f);
                                wlkVar7.b = wljVar17.b;
                                if (yno.ep(ajvuVar)) {
                                    strCg2 = yno.en(ajvuVar);
                                }
                                editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_config_group", strCg2).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", wljVar17.b);
                            }
                            if (p()) {
                                editorEdit = r(editorEdit);
                            }
                            vyl.c();
                            u(ajvuVar, alikVar);
                            ayqVar = this.k;
                            if (ayqVar != null) {
                                ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                            }
                            editorEdit.apply();
                            reentrantLock = this.o;
                        } else {
                            if (i2 == 1) {
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                strCg2 = zik.cg(str4);
                                ajvu ajvuVar6 = ajvu.a;
                                ajvuVar = (ajvu) zik.ce(strCg2, aihn.getParserForClass(ajvu.class), b(32));
                                if (ajvuVar == null) {
                                    h("SP null coldcfg", null);
                                } else {
                                    wlj wljVar18 = this.g;
                                    wljVar18.f = ajvuVar;
                                    wljVar18.b = q();
                                    wlk wlkVar8 = this.h;
                                    wlkVar8.f = e((ajvu) wljVar18.f);
                                    wlkVar8.b = wljVar18.b;
                                    if (yno.ep(ajvuVar)) {
                                        strCg2 = yno.en(ajvuVar);
                                    }
                                    editorEdit.putString("com.google.android.libraries.youtube.innertube.cold_config_group", strCg2).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", wljVar18.b);
                                }
                            }
                            if (p()) {
                                editorEdit = r(editorEdit);
                            }
                            vyl.c();
                            u(ajvuVar, alikVar);
                            ayqVar = this.k;
                            if (ayqVar != null) {
                                ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                            }
                            editorEdit.apply();
                            reentrantLock = this.o;
                        }
                        ajvuVar = null;
                        if (p()) {
                            editorEdit = r(editorEdit);
                        }
                        vyl.c();
                        u(ajvuVar, alikVar);
                        ayqVar = this.k;
                        if (ayqVar != null) {
                            ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
                        }
                        editorEdit.apply();
                        reentrantLock = this.o;
                    }
                }
                reentrantLock.unlock();
            }
            awmd awmdVar2 = this.m;
            if (awmdVar2 != null) {
                ListenableFuture listenableFutureI = ((hed) awmdVar2.io()).I(zwaVar);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i3 = 11;
                tsq tsqVar = new tsq(i3);
                ixb ixbVar = new ixb(alopVar, i3);
                Executor executor = taf.a;
                taa taaVar = new taa(ixbVar, null, tsqVar);
                long j = afwl.a;
                listenableFutureI.addListener(new ahei(listenableFutureI, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
            }
        }
    }

    public final File f(String str) throws FileNotFoundException {
        awmd awmdVar = this.l;
        awmdVar.getClass();
        return new File(((dov) awmdVar.io()).ag(), "cfg" + File.separatorChar + str);
    }

    public final void g() {
        ayq ayqVar = this.k;
        if (ayqVar != null) {
            ayqVar.K((ajvu) this.g.f, (alik) this.f.f);
        }
    }

    public final void i(tbt tbtVar) {
        tbtVar.a(this, zwt.class, new wlg(this, 1));
        tbtVar.a(this, zwu.class, new wlg(this, 0));
    }

    public final void j(tqo tqoVar) {
        tqj tqjVar;
        x("bin resetConfigs");
        if (o()) {
            try {
                tym.n(f("cg.pb"), new aesu(1));
                tym.n(f("cg.pb.new"), new aesu(1));
            } catch (Exception e) {
                h("Failed to delete config file", e);
            }
            yno.er((SharedPreferences) this.a.io(), this.c, true, true);
        }
        if (tqoVar.e()) {
            this.g.b();
            this.f.b();
            this.h.b();
            if (!o() && (tqjVar = this.c) != null) {
                tqjVar.h();
            }
        }
        vyl.e();
    }

    public final void k(tqo tqoVar) {
        tqj tqjVar;
        if (o()) {
            tqj tqjVar2 = this.c;
            if (yno.es(tqjVar2)) {
                yno.er((SharedPreferences) this.a.io(), tqjVar2, false, true);
            }
        }
        wlj wljVar = this.g;
        if (wljVar.d <= 0) {
            wljVar.d = wljVar.k.b.b();
        }
        if (tqoVar.e()) {
            v();
        }
        if (tqoVar.f()) {
            x("SP resetConfigs");
            boolean zO = o();
            awmd awmdVar = this.a;
            if (zO) {
                yno.er((SharedPreferences) awmdVar.io(), this.c, true, true);
            } else {
                ((SharedPreferences) awmdVar.io()).edit().putString("com.google.android.libraries.youtube.innertube.cold_config_group", null).putString("com.google.android.libraries.youtube.innertube.hot_config_group", null).putString("com.google.android.libraries.youtube.innertube.hot_hash_data", null).putString("com.google.android.libraries.youtube.innertube.cold_hash_data", null).apply();
            }
            if (tqoVar.e()) {
                wljVar.b();
                this.f.b();
                this.h.b();
                if (!o() && (tqjVar = this.c) != null) {
                    tqjVar.h();
                }
            }
            vyl.e();
        } else if (!tqoVar.e()) {
            v();
        }
        this.h.c();
        wljVar.c();
    }

    public final void l(boolean z) {
        awmd awmdVar;
        if (!z) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.a.io();
            alik alikVar = null;
            String string = sharedPreferences.getString("com.google.android.libraries.youtube.innertube.hot_config_group", null);
            long j = -1;
            long j2 = sharedPreferences.getLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", -1L);
            if (!TextUtils.isEmpty(string)) {
                alik alikVar2 = alik.a;
                alikVar = (alik) zik.ce(string, aihn.getParserForClass(alik.class), b(32));
            }
            if (alikVar == null) {
                alikVar = alik.a;
            } else {
                j = j2;
            }
            wlj wljVar = this.f;
            wljVar.c = j;
            wljVar.b = j;
            wljVar.a = sharedPreferences.getString("com.google.android.libraries.youtube.innertube.hot_hash_data", "");
            wljVar.f = alikVar;
        }
        this.f.c();
        if ((this.i & 4) != 0 && (awmdVar = this.d) != null) {
            i((tbt) awmdVar.io());
        }
        if (p()) {
            r(((SharedPreferences) this.a.io()).edit()).apply();
        }
    }

    public final void m() {
        Exception e;
        File fileF;
        x("->SP");
        wlj wljVar = this.g;
        String strEn = yno.en((ajvu) wljVar.f);
        wlj wljVar2 = this.f;
        ((SharedPreferences) this.a.io()).edit().putString("com.google.android.libraries.youtube.innertube.cold_config_group", strEn).putString("com.google.android.libraries.youtube.innertube.cold_hash_data", wljVar.a).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", wljVar.b).putString("com.google.android.libraries.youtube.innertube.hot_config_group", yno.eo((alik) wljVar2.f)).putString("com.google.android.libraries.youtube.innertube.hot_hash_data", wljVar2.a).putLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", wljVar2.b).apply();
        File fileF2 = null;
        try {
            fileF = f("cg.pb");
            try {
                fileF2 = f("cg.pb.new");
            } catch (Exception e2) {
                e = e2;
                h("!file", e);
            }
        } catch (Exception e3) {
            e = e3;
            fileF = null;
        }
        if (fileF != null) {
            tym.n(fileF, new aesu(1));
        }
        if (fileF2 != null) {
            tym.n(fileF2, new aesu(1));
        }
        this.j = false;
    }

    public final boolean n() {
        return (this.i & 1) != 0;
    }

    public final boolean o() {
        tqj tqjVar = this.c;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073830444)) {
                return true;
            }
        }
        return false;
    }

    @tcc
    public void onSignIn(zwt zwtVar) {
        if (n()) {
            s();
        } else {
            ((SharedPreferences) this.a.io()).edit().remove("com.google.android.libraries.youtube.innertube.hot_hash_data").apply();
            this.f.a = "";
        }
    }

    @tcc
    public void onSignOut(zwu zwuVar) {
        if (n()) {
            s();
        } else {
            ((SharedPreferences) this.a.io()).edit().remove("com.google.android.libraries.youtube.innertube.hot_hash_data").apply();
            this.f.a = "";
        }
    }

    public final boolean p() {
        aqjb aqjbVar = ((alik) this.f.f).t;
        if (aqjbVar == null) {
            aqjbVar = aqjb.a;
        }
        int i = this.i;
        int i2 = aqjbVar.b;
        this.i = i2;
        return ((i ^ i2) & 1) != 0;
    }

    @Override // defpackage.wmg
    public final /* synthetic */ void d() {
    }
}
