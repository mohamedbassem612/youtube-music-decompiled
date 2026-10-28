package defpackage;

import android.net.Uri;
import j$.util.Objects;
import j$.util.Optional;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class slb extends smc {
    public static final /* synthetic */ int f = 0;

    protected slb(String str, byte[] bArr, String str2, String str3, boolean z, wiu wiuVar, String str4, long j, sno snoVar) {
        super(str, bArr, str2, str3, z, wiuVar, str4, j, snoVar);
    }

    public boolean B() {
        return false;
    }

    public ajwo F() {
        return null;
    }

    public amud G() {
        return amud.b;
    }

    public apzz H() {
        return null;
    }

    protected final Optional I(Function function, aigw aigwVar) {
        Optional optionalE = e();
        if (true == optionalE.isPresent()) {
            optionalE = Optional.ofNullable(function.apply(optionalE.get()));
        }
        sla slaVar = new sla(aigwVar, 0);
        if (true == optionalE.isPresent()) {
            optionalE = Optional.ofNullable(aavv.s((apji) optionalE.get(), (aigw) slaVar.a));
        }
        return (true != optionalE.isPresent() || true == Objects.nonNull(optionalE.get())) ? optionalE : Optional.empty();
    }

    public abstract Optional e();

    public Optional f() {
        return Optional.empty();
    }

    public Optional g() {
        return Optional.empty();
    }

    public Uri o() {
        return null;
    }

    public ajwo q() {
        return null;
    }

    public Optional r() {
        return Optional.empty();
    }

    public Optional t() {
        return Optional.empty();
    }

    public Optional u() {
        return Optional.empty();
    }

    public String w() {
        return null;
    }
}
