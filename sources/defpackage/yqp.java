package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.proto.SabrLiveProtos$SabrLiveMetadata;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yqp extends ziq {
    private static final Pattern a = Pattern.compile("[0-9a-zA-Z_-]{11}\\.[\\d]+\\~[\\d]+");
    private final yqy b;
    private final zha c;
    private final String d;
    private final zjr e;
    private boolean f;
    private final String g;
    private volatile yqi h;
    private boolean i;
    private byi j;
    private long k;
    private boolean l;
    private long m;
    private long n;
    private final vxz o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqp(vxz vxzVar, yqy yqyVar, bye byeVar, zha zhaVar, String str, String str2, zjr zjrVar) {
        super(byeVar);
        zkf.d(byeVar);
        zkf.d(zhaVar);
        this.c = zhaVar;
        this.k = -1L;
        this.b = yqyVar;
        this.d = str;
        this.g = str2;
        this.o = vxzVar;
        this.e = zjrVar;
    }

    private final long g(byi byiVar) {
        if (this.f) {
            yti.b("Upstream DataSource already opened.");
        }
        this.i = false;
        this.f = true;
        return super.b(byiVar);
    }

    private final byi h(byi byiVar, long j, long j2) {
        long j3;
        Uri uriA;
        Uri uri = byiVar.a;
        if (this.i && this.l) {
            tyt tytVar = new tyt(uri);
            tytVar.h("headm");
            tytVar.e("sq", Long.toString(this.k));
            uriA = tytVar.a();
            j3 = -1;
        } else {
            j3 = j2;
            uriA = uri;
        }
        String str = byiVar.j;
        if (uri == uriA && byiVar.h == j && byiVar.g == j && byiVar.i == j3) {
            return byiVar;
        }
        byh byhVar = new byh(byiVar);
        byhVar.a = uriA;
        byhVar.g = j;
        byhVar.h = j3;
        byhVar.i = str;
        if (this.e.cI()) {
            Object objA = byiVar.l;
            if (objA instanceof ypq) {
                ypq ypqVar = (ypq) objA;
                if (ypqVar.i.isEmpty()) {
                    ypp yppVar = new ypp(ypqVar);
                    yppVar.j(tok.MEDIA_ONESIE_DATA_SOURCE);
                    objA = yppVar.a();
                }
            } else {
                ypp yppVarA = ypq.a();
                yppVarA.j(tok.MEDIA_ONESIE_DATA_SOURCE);
                objA = yppVarA.a();
            }
            byhVar.k = objA;
        }
        return byhVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    @Override // defpackage.ziq, defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        yqp yqpVar;
        if (!this.i || this.h == null || this.j == null) {
            yqpVar = this;
        } else {
            long j = this.n;
            if (j < 0) {
                if (j == -1) {
                    j = -1;
                } else {
                    yqpVar = this;
                }
            }
            if (j == 0) {
                return -1;
            }
            if (j != -1) {
                i2 = (int) Math.min(i2, j);
            }
            try {
                int iF = this.h.f();
                if (iF == -1) {
                    return -1;
                }
                if (iF != 0) {
                    long j2 = iF;
                    this.m += j2;
                    long j3 = this.n;
                    if (j3 != -1) {
                        this.n = j3 - j2;
                    }
                    return iF;
                }
                if ("onesievideobufferonly".equals(this.j.a.getAuthority())) {
                    throw new IOException("Giving up on OnesieVideoBuffer-only request");
                }
                this.h.a();
                zhq zhqVar = zhq.ABR;
                yqpVar = this;
                yqpVar.g(yqpVar.h(this.j, this.m, this.n));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException(e);
            }
        }
        return super.a(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[Catch: NumberFormatException -> 0x015b, PHI: r10
      0x00d8: PHI (r10v3 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v2 boolean) binds: [B:32:0x00c7, B:35:0x00d3, B:37:0x00d7] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {NumberFormatException -> 0x015b, blocks: (B:33:0x00c9, B:38:0x00d8, B:41:0x00e0, B:46:0x00f7, B:45:0x00e7), top: B:55:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0 A[Catch: NumberFormatException -> 0x015b, TryCatch #1 {NumberFormatException -> 0x015b, blocks: (B:33:0x00c9, B:38:0x00d8, B:41:0x00e0, B:46:0x00f7, B:45:0x00e7), top: B:55:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7 A[Catch: NumberFormatException -> 0x015b, TryCatch #1 {NumberFormatException -> 0x015b, blocks: (B:33:0x00c9, B:38:0x00d8, B:41:0x00e0, B:46:0x00f7, B:45:0x00e7), top: B:55:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ziq, defpackage.bye
    public final long b(byi byiVar) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        yqi yqiVar;
        boolean zM;
        long j;
        SabrLiveProtos$SabrLiveMetadata sabrLiveProtos$SabrLiveMetadataE;
        this.i = false;
        String path = byiVar.a.getPath();
        yqi yqiVarD = this.b.d(this.d);
        if (yqiVarD != null) {
            this.h = yqiVarD;
        }
        if (this.h != null && this.h.b() && path != null && path.startsWith("/videoplayback")) {
            this.j = byiVar;
            this.m = byiVar.h;
            this.n = byiVar.i;
            byi byiVar2 = this.j;
            if (byiVar2.i != -1) {
                String queryParameter5 = byiVar2.a.getQueryParameter("itag");
                String queryParameter6 = this.j.a.getQueryParameter("lmt");
                if (queryParameter5 != null && queryParameter6 != null) {
                    try {
                        Integer.parseInt(queryParameter5);
                        Long.parseLong(queryParameter6);
                        wgs.ap(typ.c(this.j.a.getQueryParameter("xtags")));
                    } catch (NumberFormatException unused) {
                        if (this.j.a.getQueryParameter("live") != null) {
                            queryParameter2 = this.j.a.getQueryParameter("itag");
                            queryParameter3 = this.j.a.getQueryParameter("headm");
                            queryParameter4 = this.j.a.getQueryParameter("sq");
                            if (queryParameter2 != null) {
                                zM = this.o.m(3, 45352432L);
                                if (queryParameter4 != null) {
                                    try {
                                        j = Long.parseLong(queryParameter4);
                                        this.k = j;
                                        if (j >= 0) {
                                            if (j == 0) {
                                                sabrLiveProtos$SabrLiveMetadataE = yqiVar.e();
                                                if (sabrLiveProtos$SabrLiveMetadataE != null) {
                                                    if (queryParameter4 != null) {
                                                        this.k = Math.max(0L, sabrLiveProtos$SabrLiveMetadataE.b - ((long) Integer.parseInt(queryParameter3)));
                                                        this.l = true;
                                                    } else if (!sabrLiveProtos$SabrLiveMetadataE.e) {
                                                        if (zM) {
                                                        }
                                                    }
                                                    Integer.parseInt(queryParameter2);
                                                    wgs.ap(this.j.a.getQueryParameter("xtags"));
                                                    this.n = -1L;
                                                    HashMap map = new HashMap();
                                                    map.put("x-head-seqnum", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.b)));
                                                    long j2 = sabrLiveProtos$SabrLiveMetadataE.c * 1000;
                                                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                                                    map.put("x-head-time-millis", Arrays.asList(Long.toString(j2 / 1000)));
                                                    map.put("x-walltime-ms", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.d)));
                                                    this.c.m(200, map);
                                                }
                                            } else if (zM) {
                                                zM = true;
                                                sabrLiveProtos$SabrLiveMetadataE = yqiVar.e();
                                                if (sabrLiveProtos$SabrLiveMetadataE != null) {
                                                    if (queryParameter4 != null) {
                                                        this.k = Math.max(0L, sabrLiveProtos$SabrLiveMetadataE.b - ((long) Integer.parseInt(queryParameter3)));
                                                        this.l = true;
                                                    } else if (!sabrLiveProtos$SabrLiveMetadataE.e) {
                                                        if (zM) {
                                                        }
                                                    }
                                                    Integer.parseInt(queryParameter2);
                                                    wgs.ap(this.j.a.getQueryParameter("xtags"));
                                                    this.n = -1L;
                                                    HashMap map2 = new HashMap();
                                                    map2.put("x-head-seqnum", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.b)));
                                                    long j3 = sabrLiveProtos$SabrLiveMetadataE.c * 1000;
                                                    TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                                                    map2.put("x-head-time-millis", Arrays.asList(Long.toString(j3 / 1000)));
                                                    map2.put("x-walltime-ms", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.d)));
                                                    this.c.m(200, map2);
                                                }
                                            }
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                } else {
                                    sabrLiveProtos$SabrLiveMetadataE = yqiVar.e();
                                    if (sabrLiveProtos$SabrLiveMetadataE != null) {
                                        if (queryParameter4 != null) {
                                            this.k = Math.max(0L, sabrLiveProtos$SabrLiveMetadataE.b - ((long) Integer.parseInt(queryParameter3)));
                                            this.l = true;
                                        } else if (!sabrLiveProtos$SabrLiveMetadataE.e) {
                                            if (zM) {
                                            }
                                        }
                                        Integer.parseInt(queryParameter2);
                                        wgs.ap(this.j.a.getQueryParameter("xtags"));
                                        this.n = -1L;
                                        HashMap map3 = new HashMap();
                                        map3.put("x-head-seqnum", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.b)));
                                        long j4 = sabrLiveProtos$SabrLiveMetadataE.c * 1000;
                                        TimeUnit timeUnit3 = TimeUnit.MICROSECONDS;
                                        map3.put("x-head-time-millis", Arrays.asList(Long.toString(j4 / 1000)));
                                        map3.put("x-walltime-ms", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.d)));
                                        this.c.m(200, map3);
                                    }
                                }
                            }
                        }
                        return g(h(byiVar, byiVar.h, byiVar.i));
                    }
                }
                this.i = true;
                zhq zhqVar = zhq.ABR;
                return this.n;
            }
            if (this.j.a.getQueryParameter("live") != null && (queryParameter = this.j.a.getQueryParameter("id")) != null && !a.matcher(queryParameter).matches()) {
                queryParameter2 = this.j.a.getQueryParameter("itag");
                queryParameter3 = this.j.a.getQueryParameter("headm");
                queryParameter4 = this.j.a.getQueryParameter("sq");
                if (queryParameter2 != null && ((queryParameter4 != null || queryParameter3 != null) && (yqiVar = this.h) != null)) {
                    zM = this.o.m(3, 45352432L);
                    if (queryParameter4 != null) {
                        j = Long.parseLong(queryParameter4);
                        this.k = j;
                        if (j >= 0) {
                            if (j == 0) {
                                sabrLiveProtos$SabrLiveMetadataE = yqiVar.e();
                                if (sabrLiveProtos$SabrLiveMetadataE != null) {
                                    if (queryParameter4 != null) {
                                        this.k = Math.max(0L, sabrLiveProtos$SabrLiveMetadataE.b - ((long) Integer.parseInt(queryParameter3)));
                                        this.l = true;
                                    } else if (!sabrLiveProtos$SabrLiveMetadataE.e) {
                                        if (zM) {
                                        }
                                    }
                                    Integer.parseInt(queryParameter2);
                                    wgs.ap(this.j.a.getQueryParameter("xtags"));
                                    this.n = -1L;
                                    HashMap map4 = new HashMap();
                                    map4.put("x-head-seqnum", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.b)));
                                    long j5 = sabrLiveProtos$SabrLiveMetadataE.c * 1000;
                                    TimeUnit timeUnit4 = TimeUnit.MICROSECONDS;
                                    map4.put("x-head-time-millis", Arrays.asList(Long.toString(j5 / 1000)));
                                    map4.put("x-walltime-ms", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.d)));
                                    this.c.m(200, map4);
                                    this.i = true;
                                    zhq zhqVar2 = zhq.ABR;
                                    return this.n;
                                }
                            } else if (zM) {
                                zM = true;
                                sabrLiveProtos$SabrLiveMetadataE = yqiVar.e();
                                if (sabrLiveProtos$SabrLiveMetadataE != null) {
                                    if (queryParameter4 != null) {
                                        this.k = Math.max(0L, sabrLiveProtos$SabrLiveMetadataE.b - ((long) Integer.parseInt(queryParameter3)));
                                        this.l = true;
                                    } else if (!sabrLiveProtos$SabrLiveMetadataE.e) {
                                        if (zM) {
                                        }
                                    }
                                    Integer.parseInt(queryParameter2);
                                    wgs.ap(this.j.a.getQueryParameter("xtags"));
                                    this.n = -1L;
                                    HashMap map5 = new HashMap();
                                    map5.put("x-head-seqnum", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.b)));
                                    long j6 = sabrLiveProtos$SabrLiveMetadataE.c * 1000;
                                    TimeUnit timeUnit5 = TimeUnit.MICROSECONDS;
                                    map5.put("x-head-time-millis", Arrays.asList(Long.toString(j6 / 1000)));
                                    map5.put("x-walltime-ms", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.d)));
                                    this.c.m(200, map5);
                                    this.i = true;
                                    zhq zhqVar3 = zhq.ABR;
                                    return this.n;
                                }
                            }
                        }
                    } else {
                        sabrLiveProtos$SabrLiveMetadataE = yqiVar.e();
                        if (sabrLiveProtos$SabrLiveMetadataE != null) {
                            if (queryParameter4 != null) {
                                this.k = Math.max(0L, sabrLiveProtos$SabrLiveMetadataE.b - ((long) Integer.parseInt(queryParameter3)));
                                this.l = true;
                            } else if (!sabrLiveProtos$SabrLiveMetadataE.e) {
                                if (zM) {
                                }
                            }
                            Integer.parseInt(queryParameter2);
                            wgs.ap(this.j.a.getQueryParameter("xtags"));
                            this.n = -1L;
                            HashMap map6 = new HashMap();
                            map6.put("x-head-seqnum", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.b)));
                            long j7 = sabrLiveProtos$SabrLiveMetadataE.c * 1000;
                            TimeUnit timeUnit6 = TimeUnit.MICROSECONDS;
                            map6.put("x-head-time-millis", Arrays.asList(Long.toString(j7 / 1000)));
                            map6.put("x-walltime-ms", Arrays.asList(Long.toString(sabrLiveProtos$SabrLiveMetadataE.d)));
                            this.c.m(200, map6);
                            this.i = true;
                            zhq zhqVar4 = zhq.ABR;
                            return this.n;
                        }
                    }
                }
            }
        }
        return g(h(byiVar, byiVar.h, byiVar.i));
    }

    @Override // defpackage.ziq, defpackage.bye
    public final Uri c() {
        return this.i ? this.j.a : super.c();
    }

    @Override // defpackage.ziq, defpackage.bye
    public final void f() {
        if (this.f) {
            this.f = false;
            super.f();
        }
    }
}
