package defpackage;

import io.grpc.Status;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avhp implements Closeable, avei {
    public avhn a;
    public int b;
    public auzj c;
    public long e;
    private final avjz h;
    private final avkf i;
    private boolean k;
    private avee l;
    private int o;
    private int p = 1;
    private int j = 5;
    public avee d = new avee();
    private boolean m = false;
    private int n = -1;
    public boolean f = false;
    public volatile boolean g = false;

    public avhp(avhn avhnVar, auzj auzjVar, int i, avjz avjzVar, avkf avkfVar) {
        this.a = avhnVar;
        this.c = auzjVar;
        this.b = i;
        this.h = avjzVar;
        this.i = avkfVar;
    }

    public final void a() {
        int i;
        Object avimVar;
        if (this.m) {
            return;
        }
        this.m = true;
        loop0: while (true) {
            try {
                boolean z = this.g;
                if (this.e <= 0) {
                    break;
                }
                try {
                    if (this.j > 0 && this.d.a == 0) {
                        break;
                    }
                    if (this.l == null) {
                        this.l = new avee();
                    }
                    i = 0;
                    while (true) {
                        try {
                            int i2 = this.j - this.l.a;
                            if (i2 > 0) {
                                int i3 = this.d.a;
                                if (i3 == 0) {
                                    if (i <= 0) {
                                        break loop0;
                                    }
                                    this.a.j(i);
                                    if (this.p != 2) {
                                        break loop0;
                                    }
                                    this.h.a(i);
                                    this.o += i;
                                    break loop0;
                                }
                                int iMin = Math.min(i2, i3);
                                i += iMin;
                                this.l.h(this.d.g(iMin));
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (i > 0) {
                                this.a.j(i);
                                if (this.p == 2) {
                                    this.h.a(i);
                                    this.o += i;
                                }
                            }
                            throw th;
                        }
                    }
                    if (i > 0) {
                        this.a.j(i);
                        if (this.p == 2) {
                            this.h.a(i);
                            this.o += i;
                        }
                    }
                    int i4 = this.p;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 0) {
                        int iE = this.l.e();
                        if ((iE & 254) != 0) {
                            throw new avcg(Status.l.withDescription("gRPC frame header malformed: reserved bits not zero"));
                        }
                        this.k = 1 == (iE & 1);
                        avee aveeVar = this.l;
                        aveeVar.a(4);
                        int iE2 = (aveeVar.e() << 24) | (aveeVar.e() << 16) | (aveeVar.e() << 8) | aveeVar.e();
                        this.j = iE2;
                        if (iE2 < 0 || iE2 > this.b) {
                            throw new avcg(Status.h.withDescription(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.b), Integer.valueOf(this.j))));
                        }
                        this.n++;
                        for (avjt avjtVar : this.h.b) {
                        }
                        avkf avkfVar = this.i;
                        avkfVar.d.a();
                        avkfVar.e = avkfVar.a.a();
                        this.p = 2;
                    } else {
                        if (i5 != 1) {
                            throw new AssertionError(a.ce(i4 != 1 ? "BODY" : "HEADER", "Invalid state: "));
                        }
                        avjz avjzVar = this.h;
                        for (avjt avjtVar2 : avjzVar.b) {
                        }
                        this.o = 0;
                        if (this.k) {
                            auzj auzjVar = this.c;
                            if (auzjVar == auyx.a) {
                                throw new avcg(Status.l.withDescription("Can't decode compressed gRPC message as compression not configured"));
                            }
                            try {
                                avee aveeVar2 = this.l;
                                avil avilVar = avip.a;
                                avimVar = new avho(auzjVar.a(new avim(aveeVar2)), this.b, avjzVar);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            int i6 = this.l.a;
                            avjz.b(avjzVar);
                            avee aveeVar3 = this.l;
                            avil avilVar2 = avip.a;
                            avimVar = new avim(aveeVar3);
                        }
                        this.l = null;
                        this.a.f(new auym(avimVar));
                        this.p = 1;
                        this.j = 5;
                        this.e--;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            } catch (Throwable th3) {
                this.m = false;
                throw th3;
            }
        }
        boolean z2 = this.g;
        if (this.f && c()) {
            close();
        }
        this.m = false;
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.avei
    public final void close() {
        if (b()) {
            return;
        }
        avee aveeVar = this.l;
        boolean z = false;
        if (aveeVar != null && aveeVar.a > 0) {
            z = true;
        }
        try {
            avee aveeVar2 = this.d;
            if (aveeVar2 != null) {
                aveeVar2.close();
            }
            avee aveeVar3 = this.l;
            if (aveeVar3 != null) {
                aveeVar3.close();
            }
            this.d = null;
            this.l = null;
            this.a.d(z);
        } catch (Throwable th) {
            this.d = null;
            this.l = null;
            throw th;
        }
    }
}
