package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tgi {
    public final tmo a;
    public final Optional b;
    public final tgl c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Executor h;
    public final int i;
    public final String j;
    public final boolean k;

    public tgi(tmo tmoVar, Optional optional, tgl tglVar, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Executor executor, int i, String str, boolean z) {
        this.a = tmoVar;
        this.b = optional;
        this.c = tglVar;
        this.d = optional2;
        this.e = optional3;
        this.f = optional4;
        this.g = optional5;
        this.h = executor;
        this.i = i;
        this.j = str;
        this.k = z;
    }

    public static tgh a() {
        tgh tghVar = new tgh();
        tghVar.e(false);
        tghVar.g();
        return tghVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tgi) {
            tgi tgiVar = (tgi) obj;
            if (this.a.equals(tgiVar.a) && this.b.equals(tgiVar.b) && this.c.equals(tgiVar.c) && this.d.equals(tgiVar.d) && this.e.equals(tgiVar.e) && this.f.equals(tgiVar.f) && this.g.equals(tgiVar.g) && this.h.equals(tgiVar.h) && this.i == tgiVar.i && this.j.equals(tgiVar.j) && this.k == tgiVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (true != this.k ? 1237 : 1231);
    }

    public final String toString() {
        Executor executor = this.h;
        Optional optional = this.g;
        Optional optional2 = this.f;
        Optional optional3 = this.e;
        Optional optional4 = this.d;
        tgl tglVar = this.c;
        Optional optional5 = this.b;
        return "CreationParams{cache=" + String.valueOf(this.a) + ", cacheEventLogger=" + String.valueOf(optional5) + ", volleyNetworkConfig=" + String.valueOf(tglVar) + ", requestLogger=null, priorityExecutor=" + String.valueOf(optional4) + ", priorityCoroutineScope=" + String.valueOf(optional3) + ", normalExecutor=" + String.valueOf(optional2) + ", normalCoroutineScope=" + String.valueOf(optional) + ", deliveryExecutor=" + String.valueOf(executor) + ", threadPoolSize=" + this.i + ", threadPoolTag=" + this.j + ", useV2=" + this.k + '}';
    }

    public tgi() {
        throw null;
    }
}
