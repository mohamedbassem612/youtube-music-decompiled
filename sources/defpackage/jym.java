package defpackage;

import android.net.Network;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jym {
    public jyp a;
    public String b;
    public List c;
    public List d;
    public List e;
    public List f;
    public String g;
    public String h;
    public Network i;
    public int j;
    public byte k;
    private int l;
    private boolean m;
    private boolean n;

    public final jyn a() {
        jyp jypVar = this.a;
        String str = this.b;
        if (jypVar == null) {
            if (str == null) {
                throw new IllegalArgumentException("#setAccount or #setObfuscatedGaiaId must be called.");
            }
        } else if (str != null) {
            throw new IllegalArgumentException("Both setObfuscatedGaiaId and setAccount cannot be called.");
        }
        List list = this.c;
        if (list == null && this.d == null && this.e == null && this.f == null) {
            throw new IllegalArgumentException("A token type must be specified.");
        }
        int i = list != null ? 1 : 0;
        if (this.d != null) {
            i++;
        }
        if (this.e != null) {
            i++;
        }
        if (this.f != null) {
            i++;
        }
        if (i == 0) {
            throw new IllegalArgumentException("No auth token type specified. Please specify exactly one type of auth token.");
        }
        if (i > 1) {
            throw new IllegalArgumentException("GetTokenRequest supports only one token type per request. Please call only one of setOauth2Scopes(), setWebLoginUrls(), setClientLoginScopes(), setOauth2TokenIdScopes()");
        }
        if (this.g != null && b() == 0) {
            throw new IllegalArgumentException("Please provide a delegation type for the user id.");
        }
        if (b() == 1 && this.g == null) {
            throw new IllegalArgumentException("Please provide a delegatee user ID.");
        }
        if (this.k == 31) {
            return new jyn(this.a, this.b, this.c, this.d, this.e, this.f, this.l, this.g, false, null, this.h, this.m, this.i, this.n, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.k & 1) == 0) {
            sb.append(" delegationType");
        }
        if ((this.k & 2) == 0) {
            sb.append(" handleNotification");
        }
        if ((this.k & 4) == 0) {
            sb.append(" suppressProgressScreen");
        }
        if ((this.k & 8) == 0) {
            sb.append(" useNewExceptions");
        }
        if ((this.k & 16) == 0) {
            sb.append(" clientVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final int b() {
        if ((this.k & 1) != 0) {
            return this.l;
        }
        throw new IllegalStateException("Property \"delegationType\" has not been set");
    }

    public final void c(int i) {
        this.l = i;
        this.k = (byte) (this.k | 1);
    }

    public final void d(boolean z) {
        this.m = z;
        this.k = (byte) (this.k | 4);
    }

    public final void e(boolean z) {
        this.n = z;
        this.k = (byte) (this.k | 8);
    }
}
