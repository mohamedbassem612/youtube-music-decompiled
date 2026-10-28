package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahgr {
    public Object a;
    public Object b;

    public ahgr(byte[] bArr, byte[] bArr2) {
        this.a = Optional.empty();
        this.b = Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final RuntimeException a(boolean z) {
        StringBuilder sb = new StringBuilder("expected one element but was: <");
        sb.append(this.b);
        for (Object obj : this.a) {
            sb.append(", ");
            sb.append(obj);
        }
        if (z) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final void b(Object obj) {
        obj.getClass();
        if (this.b == null) {
            this.b = obj;
            return;
        }
        if (this.a.isEmpty()) {
            ArrayList arrayList = new ArrayList(4);
            this.a = arrayList;
            arrayList.add(obj);
        } else {
            if (this.a.size() >= 4) {
                throw a(true);
            }
            this.a.add(obj);
        }
    }

    public final adyx c() {
        return new adyx((Optional) this.a, (Optional) this.b);
    }

    public final void d(ajwo ajwoVar) {
        this.b = Optional.of(ajwoVar);
    }

    public final void e(abnp abnpVar) {
        if (abnpVar == null) {
            throw new NullPointerException("Null playbackStartParameters");
        }
        this.b = abnpVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [avmn, java.lang.Object] */
    public final abrj f() {
        Object obj;
        ?? r0 = this.b;
        if (r0 != 0 && (obj = this.a) != null) {
            return new abrj(r0, (agkj) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" connection");
        }
        if (this.a == null) {
            sb.append(" responseStreams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(avmn avmnVar) {
        if (avmnVar == null) {
            throw new NullPointerException("Null connection");
        }
        this.b = avmnVar;
    }

    public final void h(agkj agkjVar) {
        if (agkjVar == null) {
            throw new NullPointerException("Null responseStreams");
        }
        this.a = agkjVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wjf] */
    public final abng i() {
        Object obj;
        ?? r0 = this.a;
        if (r0 != 0 && (obj = this.b) != null) {
            return new abng(r0, (Instant) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" playerResponseModel");
        }
        if (this.b == null) {
            sb.append(" timeStampReceived");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null timeStampReceived");
        }
        this.b = instant;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aajy, java.lang.Object] */
    public final aajj k() {
        Object obj;
        ?? r0 = this.a;
        if (r0 != 0 && (obj = this.b) != null) {
            return new aajj(r0, (akne) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" appSearchDocument");
        }
        if (this.b == null) {
            sb.append(" downloadsSearchDocument");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void l(aajy aajyVar) {
        if (aajyVar == null) {
            throw new NullPointerException("Null appSearchDocument");
        }
        this.a = aajyVar;
    }

    public final void m(akne akneVar) {
        if (akneVar == null) {
            throw new NullPointerException("Null downloadsSearchDocument");
        }
        this.b = akneVar;
    }

    public ahgr(abrj abrjVar) {
        this.b = abrjVar.a;
        this.a = abrjVar.b;
    }

    public ahgr() {
    }

    public ahgr(byte[] bArr) {
        this.b = null;
        this.a = Collections.EMPTY_LIST;
    }
}
