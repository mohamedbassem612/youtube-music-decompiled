package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class afsx implements afvl {
    private final afvl a;
    private final UUID b;
    private final String c;
    private final String d;
    private Thread e;
    private aftj f;

    public afsx(String str, afvl afvlVar, afvh afvhVar) {
        str.getClass();
        this.d = str;
        this.a = afvlVar;
        this.b = afvlVar.g();
        this.c = afvlVar.e();
        aftj aftjVar = afvhVar.e;
        if (aftjVar == null) {
            this.f = null;
            this.e = Thread.currentThread();
        } else {
            this.f = aftjVar;
            this.e = null;
        }
        if (this.f == afvlVar.a()) {
            afvlVar.f();
        }
    }

    public static String kg(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.afvl
    public aftj a() {
        return this.f;
    }

    @Override // defpackage.afvl
    public final afvl b() {
        return this.a;
    }

    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        afty.j(this);
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.afvl
    public final String d() {
        return this.d;
    }

    @Override // defpackage.afvl
    public final String e() {
        return this.c;
    }

    @Override // defpackage.afvl
    public Thread f() {
        return this.e;
    }

    @Override // defpackage.afvl
    public final UUID g() {
        return this.b;
    }

    public final String toString() {
        return afty.i(this);
    }

    public afsx(String str, UUID uuid, String str2, afvh afvhVar) {
        str.getClass();
        this.d = str;
        Thread threadCurrentThread = null;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        aftj aftjVar = afvhVar.e;
        if (aftjVar == null) {
            this.f = null;
            threadCurrentThread = Thread.currentThread();
        } else {
            this.f = aftjVar;
        }
        this.e = threadCurrentThread;
    }
}
