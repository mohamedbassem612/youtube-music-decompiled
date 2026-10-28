package defpackage;

import j$.lang.Iterable$EL;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qus implements Cloneable {
    private final UUID a;
    public final List f;
    public boolean g;

    protected qus(qus qusVar) {
        this.f = new ArrayList();
        this.g = true;
        this.a = qusVar.a;
        Iterable$EL.forEach(qusVar.f, new kjk(this, 12));
        this.g = qusVar.g;
    }

    @Override // 
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract qus clone();

    public final List b() {
        return DesugarCollections.unmodifiableList(this.f);
    }

    public final void c(qvc qvcVar) {
        this.f.add(qvcVar);
    }

    protected qus() {
        this.f = new ArrayList();
        this.g = true;
        this.a = UUID.randomUUID();
    }
}
