package defpackage;

import android.util.Size;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfw {
    public Optional a;
    public long b;
    public long c;
    public UUID d;
    public Optional e;
    public bru f;
    public Optional g;
    public byte h;
    private Size i;
    private long j;

    public rfw(rfx rfxVar) {
        this.a = Optional.empty();
        this.e = Optional.empty();
        this.g = Optional.empty();
        this.i = rfxVar.a;
        this.a = rfxVar.b;
        this.j = rfxVar.c;
        this.b = rfxVar.d;
        this.c = rfxVar.e;
        this.d = rfxVar.f;
        this.e = rfxVar.g;
        this.f = rfxVar.h;
        this.g = rfxVar.i;
        this.h = (byte) 7;
    }

    public final rfx a() {
        Size size;
        UUID uuid;
        bru bruVar;
        if (this.h == 7 && (size = this.i) != null && (uuid = this.d) != null && (bruVar = this.f) != null) {
            return new rfx(size, this.a, this.j, this.b, this.c, uuid, this.e, bruVar, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == null) {
            sb.append(" textureSize");
        }
        if ((this.h & 1) == 0) {
            sb.append(" textureTimestamp");
        }
        if ((this.h & 2) == 0) {
            sb.append(" presentationTimestamp");
        }
        if ((this.h & 4) == 0) {
            sb.append(" sourceTimestamp");
        }
        if (this.d == null) {
            sb.append(" referenceId");
        }
        if (this.f == null) {
            sb.append(" colorInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Size size) {
        if (size == null) {
            throw new NullPointerException("Null textureSize");
        }
        this.i = size;
    }

    public final void c(long j) {
        this.j = j;
        this.h = (byte) (this.h | 1);
    }

    public rfw() {
        this.a = Optional.empty();
        this.e = Optional.empty();
        this.g = Optional.empty();
    }
}
