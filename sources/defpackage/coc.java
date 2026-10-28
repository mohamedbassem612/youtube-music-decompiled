package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class coc implements crm {
    public final bze b;
    public long c;
    public cwj e;
    public boolean f;
    final /* synthetic */ cog g;
    private final Uri h;
    private final cvk i;
    private volatile boolean j;
    private final ovo m;
    private final zhk n;
    private final qha l = new qha();
    private boolean k = true;
    public final long a = cnd.a();
    public byi d = d(0, null);

    public coc(cog cogVar, Uri uri, bye byeVar, ovo ovoVar, cvk cvkVar, zhk zhkVar) {
        this.g = cogVar;
        this.h = uri;
        this.b = new bze(byeVar);
        this.m = ovoVar;
        this.i = cvkVar;
        this.n = zhkVar;
    }

    private final byi d(long j, String str) {
        Map mapD = cog.a;
        if (str != null && !str.startsWith("W/")) {
            agkh agkhVar = new agkh(4);
            agkhVar.i(mapD);
            agkhVar.e("If-Range", str);
            mapD = agkhVar.d(false);
        }
        byh byhVar = new byh();
        byhVar.a = this.h;
        byhVar.g = j;
        byhVar.i = this.g.c;
        byhVar.j = 6;
        byhVar.f = mapD;
        return byhVar.a();
    }

    @Override // defpackage.crm
    public final void a() {
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01da  */
    /* JADX WARN: Code duplicated, block: B:116:0x0205  */
    /* JADX WARN: Code duplicated, block: B:128:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6 A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:23:0x006f, B:33:0x009c, B:35:0x00a6, B:37:0x00b2, B:39:0x00bc, B:41:0x00c8, B:43:0x00d2, B:45:0x00de, B:47:0x00e8, B:49:0x00fa, B:51:0x0104, B:52:0x010a, B:62:0x012d, B:64:0x0136, B:66:0x0140, B:68:0x0144, B:70:0x015c, B:56:0x0114, B:59:0x011d, B:27:0x007b, B:30:0x0086), top: B:122:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:23:0x006f, B:33:0x009c, B:35:0x00a6, B:37:0x00b2, B:39:0x00bc, B:41:0x00c8, B:43:0x00d2, B:45:0x00de, B:47:0x00e8, B:49:0x00fa, B:51:0x0104, B:52:0x010a, B:62:0x012d, B:64:0x0136, B:66:0x0140, B:68:0x0144, B:70:0x015c, B:56:0x0114, B:59:0x011d, B:27:0x007b, B:30:0x0086), top: B:122:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2 A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:23:0x006f, B:33:0x009c, B:35:0x00a6, B:37:0x00b2, B:39:0x00bc, B:41:0x00c8, B:43:0x00d2, B:45:0x00de, B:47:0x00e8, B:49:0x00fa, B:51:0x0104, B:52:0x010a, B:62:0x012d, B:64:0x0136, B:66:0x0140, B:68:0x0144, B:70:0x015c, B:56:0x0114, B:59:0x011d, B:27:0x007b, B:30:0x0086), top: B:122:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8 A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:23:0x006f, B:33:0x009c, B:35:0x00a6, B:37:0x00b2, B:39:0x00bc, B:41:0x00c8, B:43:0x00d2, B:45:0x00de, B:47:0x00e8, B:49:0x00fa, B:51:0x0104, B:52:0x010a, B:62:0x012d, B:64:0x0136, B:66:0x0140, B:68:0x0144, B:70:0x015c, B:56:0x0114, B:59:0x011d, B:27:0x007b, B:30:0x0086), top: B:122:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #7 {all -> 0x01eb, blocks: (B:23:0x006f, B:33:0x009c, B:35:0x00a6, B:37:0x00b2, B:39:0x00bc, B:41:0x00c8, B:43:0x00d2, B:45:0x00de, B:47:0x00e8, B:49:0x00fa, B:51:0x0104, B:52:0x010a, B:62:0x012d, B:64:0x0136, B:66:0x0140, B:68:0x0144, B:70:0x015c, B:56:0x0114, B:59:0x011d, B:27:0x007b, B:30:0x0086), top: B:122:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d A[Catch: all -> 0x01eb, TryCatch #7 {all -> 0x01eb, blocks: (B:23:0x006f, B:33:0x009c, B:35:0x00a6, B:37:0x00b2, B:39:0x00bc, B:41:0x00c8, B:43:0x00d2, B:45:0x00de, B:47:0x00e8, B:49:0x00fa, B:51:0x0104, B:52:0x010a, B:62:0x012d, B:64:0x0136, B:66:0x0140, B:68:0x0144, B:70:0x015c, B:56:0x0114, B:59:0x011d, B:27:0x007b, B:30:0x0086), top: B:122:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x017f A[Catch: all -> 0x01e8, TRY_LEAVE, TryCatch #5 {all -> 0x01e8, blocks: (B:71:0x016b, B:73:0x016f, B:75:0x0173, B:77:0x0177, B:78:0x017b, B:80:0x017f), top: B:132:0x016b }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01b9 A[Catch: all -> 0x01ca, TryCatch #6 {all -> 0x01ca, blocks: (B:83:0x018e, B:85:0x0192, B:86:0x0197, B:88:0x01b3, B:90:0x01b9, B:92:0x01c2, B:93:0x01c7), top: B:134:0x018e, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d2  */
    /* JADX WARN: Type inference failed for: r11v4, types: [cvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [cvj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24, types: [cvi, java.lang.Object] */
    @Override // defpackage.crm
    public final void b() throws Throwable {
        long j;
        boolean z;
        ovo ovoVar;
        boolean z2;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean zEquals;
        List list5;
        int i2;
        cxx cxxVar;
        bze bzeVar;
        cog cogVar;
        cxx cxxVar2;
        brv brvVar;
        ovo ovoVar2;
        int iG;
        zhk zhkVar;
        long jA;
        Object obj;
        int i3;
        String str4;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        String str5 = null;
        while (i7 == 0 && !this.j) {
            try {
                long j2 = this.l.a;
                byi byiVarD = d(j2, str5);
                this.d = byiVarD;
                bze bzeVar2 = this.b;
                long jB = bzeVar2.b(byiVarD);
                if (this.j) {
                    aua.d(this.b);
                    return;
                }
                List list6 = (List) bzeVar2.d().get("ETag");
                str5 = (list6 == null || list6.isEmpty()) ? null : (String) list6.get(0);
                if (jB != -1) {
                    jB += j2;
                    cog cogVar2 = this.g;
                    cogVar2.g.post(new bkn(cogVar2, 19));
                }
                long j3 = jB;
                cog cogVar3 = this.g;
                Map mapD = bzeVar2.d();
                List list7 = (List) mapD.get("icy-br");
                try {
                    if (list7 != null) {
                        String str6 = (String) list7.get(0);
                        j = -1;
                        try {
                            try {
                                i5 = Integer.parseInt(str6) * 1000;
                                if (i5 > 0) {
                                    i = i5;
                                    z2 = true;
                                } else {
                                    try {
                                        bvx.e("IcyHeaders", a.ce(str6, "Invalid bitrate: "));
                                    } catch (NumberFormatException unused) {
                                        bvx.e("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str6)));
                                        i = i5;
                                        z2 = false;
                                    }
                                }
                            } catch (NumberFormatException unused2) {
                                i5 = -1;
                            }
                            list = (List) mapD.get("icy-genre");
                            if (list != null) {
                                str = (String) list.get(0);
                                z2 = true;
                            } else {
                                str = null;
                            }
                            list2 = (List) mapD.get("icy-name");
                            if (list2 != null) {
                                str2 = (String) list2.get(0);
                                z2 = true;
                            } else {
                                str2 = null;
                            }
                            list3 = (List) mapD.get("icy-url");
                            if (list3 != null) {
                                str3 = (String) list3.get(0);
                                z2 = true;
                            } else {
                                str3 = null;
                            }
                            list4 = (List) mapD.get("icy-pub");
                            if (list4 != null) {
                                zEquals = ((String) list4.get(0)).equals("1");
                                z2 = true;
                            } else {
                                zEquals = false;
                            }
                            list5 = (List) mapD.get("icy-metaint");
                            if (list5 != null) {
                                str4 = (String) list5.get(0);
                                try {
                                    i4 = Integer.parseInt(str4);
                                    if (i4 > 0) {
                                        z2 = true;
                                        i2 = i4;
                                    } else {
                                        try {
                                            bvx.e("IcyHeaders", a.ce(str4, "Invalid metadata interval: "));
                                            i2 = -1;
                                        } catch (NumberFormatException unused3) {
                                            bvx.e("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str4)));
                                            i2 = i4;
                                        }
                                    }
                                } catch (NumberFormatException unused4) {
                                    i4 = -1;
                                }
                            } else {
                                i2 = -1;
                            }
                            if (z2) {
                                cxxVar = new cxx(i, str, str2, str3, zEquals, i2);
                            } else {
                                cxxVar = null;
                            }
                            cogVar3.j = cxxVar;
                            bzeVar = this.b;
                            cogVar = this.g;
                            cxxVar2 = cogVar.j;
                            if (cxxVar2 != null || (i3 = cxxVar2.f) == -1) {
                                brvVar = bzeVar;
                            } else {
                                cnb cnbVar = new cnb(bzeVar, i3, this);
                                cwj cwjVarR = cogVar.r(new cof(0, true));
                                this.e = cwjVarR;
                                cwjVarR.b(cog.b);
                                brvVar = cnbVar;
                            }
                            ovoVar2 = this.m;
                            ovoVar2.b(brvVar, this.h, bzeVar.d(), j2, j3, this.i);
                            if (cogVar.j != null && (obj = ovoVar2.c) != null && (obj instanceof czh)) {
                                ((czh) obj).a = true;
                            }
                            if (this.k) {
                                long j4 = this.c;
                                ?? r7 = ovoVar2.c;
                                r7.getClass();
                                r7.d(j2, j4);
                                this.k = false;
                            }
                            iG = 0;
                            while (iG == 0) {
                                try {
                                    if (!this.j) {
                                        iG = 0;
                                        break;
                                    }
                                    try {
                                        zhkVar = this.n;
                                        zhkVar.b();
                                        qha qhaVar = this.l;
                                        ?? r11 = ovoVar2.c;
                                        r11.getClass();
                                        ?? r14 = ovoVar2.b;
                                        r14.getClass();
                                        iG = r11.g(r14, qhaVar);
                                        jA = ovoVar2.a();
                                        if (jA <= 1048576 + j2) {
                                            if (zhkVar.f()) {
                                                cogVar.g.post(cogVar.f);
                                            }
                                            j2 = jA;
                                        }
                                    } catch (InterruptedException unused5) {
                                        throw new InterruptedIOException();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z = true;
                                    i6 = iG;
                                    if (i6 != 1 && z) {
                                        ovoVar = this.m;
                                        if (ovoVar.a() != j) {
                                            this.l.a = ovoVar.a();
                                        }
                                    }
                                    aua.d(this.b);
                                    throw th;
                                }
                            }
                            if (iG == 1) {
                                i7 = 0;
                            } else {
                                if (ovoVar2.a() != j) {
                                    this.l.a = ovoVar2.a();
                                }
                                i7 = iG;
                            }
                            aua.d(bzeVar);
                        } catch (Throwable th2) {
                            th = th2;
                            z = false;
                            if (i6 != 1) {
                                ovoVar = this.m;
                                if (ovoVar.a() != j) {
                                    this.l.a = ovoVar.a();
                                }
                            }
                            aua.d(this.b);
                            throw th;
                        }
                    } else {
                        j = -1;
                    }
                    if (cogVar.j != null) {
                        ((czh) obj).a = true;
                    }
                    if (this.k) {
                        long j5 = this.c;
                        ?? r8 = ovoVar2.c;
                        r8.getClass();
                        r8.d(j2, j5);
                        this.k = false;
                    }
                    iG = 0;
                    while (iG == 0) {
                        if (!this.j) {
                            iG = 0;
                            break;
                        }
                        zhkVar = this.n;
                        zhkVar.b();
                        qha qhaVar2 = this.l;
                        ?? r12 = ovoVar2.c;
                        r12.getClass();
                        ?? r15 = ovoVar2.b;
                        r15.getClass();
                        iG = r12.g(r15, qhaVar2);
                        jA = ovoVar2.a();
                        if (jA <= 1048576 + j2) {
                            if (zhkVar.f()) {
                                cogVar.g.post(cogVar.f);
                            }
                            j2 = jA;
                        }
                    }
                    if (iG == 1) {
                        i7 = 0;
                    } else {
                        if (ovoVar2.a() != j) {
                            this.l.a = ovoVar2.a();
                        }
                        i7 = iG;
                    }
                    aua.d(bzeVar);
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                }
                z2 = false;
                i = -1;
                list = (List) mapD.get("icy-genre");
                if (list != null) {
                    str = (String) list.get(0);
                    z2 = true;
                } else {
                    str = null;
                }
                list2 = (List) mapD.get("icy-name");
                if (list2 != null) {
                    str2 = (String) list2.get(0);
                    z2 = true;
                } else {
                    str2 = null;
                }
                list3 = (List) mapD.get("icy-url");
                if (list3 != null) {
                    str3 = (String) list3.get(0);
                    z2 = true;
                } else {
                    str3 = null;
                }
                list4 = (List) mapD.get("icy-pub");
                if (list4 != null) {
                    zEquals = ((String) list4.get(0)).equals("1");
                    z2 = true;
                } else {
                    zEquals = false;
                }
                list5 = (List) mapD.get("icy-metaint");
                if (list5 != null) {
                    str4 = (String) list5.get(0);
                    i4 = Integer.parseInt(str4);
                    if (i4 > 0) {
                        z2 = true;
                        i2 = i4;
                    } else {
                        bvx.e("IcyHeaders", a.ce(str4, "Invalid metadata interval: "));
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                if (z2) {
                    cxxVar = new cxx(i, str, str2, str3, zEquals, i2);
                } else {
                    cxxVar = null;
                }
                cogVar3.j = cxxVar;
                bzeVar = this.b;
                cogVar = this.g;
                cxxVar2 = cogVar.j;
                if (cxxVar2 != null) {
                    brvVar = bzeVar;
                } else {
                    brvVar = bzeVar;
                }
                ovoVar2 = this.m;
                ovoVar2.b(brvVar, this.h, bzeVar.d(), j2, j3, this.i);
            } catch (Throwable th4) {
                th = th4;
                j = -1;
            }
        }
    }

    public final void c(long j, long j2) {
        this.l.a = j;
        this.c = j2;
        this.k = true;
        this.f = false;
    }
}
