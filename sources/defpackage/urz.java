package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.io.File;
import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class urz {
    public final File b;
    public agkj e;
    public agkj f;
    public final aghp a = new agjo(16);
    public agke c = agpi.a;
    public Optional d = Optional.empty();

    public urz(File file) {
        this.b = file;
        agkj agkjVar = agpn.b;
        this.e = agkjVar;
        this.f = agkjVar;
    }

    public final Uri a(String str) {
        return Uri.fromFile(new File(this.b, str));
    }

    public final qwo b(auey aueyVar) {
        return (qwo) this.f.get(aueyVar);
    }

    public final Optional c(long j) {
        return Optional.ofNullable((UUID) this.a.a().get(Long.valueOf(j)));
    }

    public final void d(long j, UUID uuid) {
        aghp aghpVar = this.a;
        ahno.G(!aghpVar.containsKey(uuid), "Registering ID pair for existing media composition ID.");
        Long lValueOf = Long.valueOf(j);
        ahno.G(!aghpVar.containsValue(lValueOf), "Registering ID pair for existing editor ID.");
        ((agjo) aghpVar).g(uuid, lValueOf, false);
    }

    public final void e(long j, Function function) {
        agkj agkjVar = this.e;
        Long lValueOf = Long.valueOf(j);
        utc utcVar = (utc) agkjVar.get(lValueOf);
        if (utcVar == null) {
            utcVar = new utc(j, null, null);
        }
        this.e = nuo.j(this.e, lValueOf, (utc) function.apply(utcVar));
    }

    public final void f(long j) {
        Optional.ofNullable((UUID) this.a.a().remove(Long.valueOf(j)));
    }
}
