package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aghk extends aggz implements agpv {
    private static final long serialVersionUID = 7431625294878419160L;

    public aghk(Map map) {
        super(map);
    }

    @Override // defpackage.aggz
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.aggz
    public Collection d(Collection collection) {
        return DesugarCollections.unmodifiableSet((Set) collection);
    }

    @Override // defpackage.aggz
    public Collection e(Object obj, Collection collection) {
        return new aggx(this, obj, (Set) collection);
    }

    @Override // defpackage.aggz, defpackage.agom
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Set c(Object obj) {
        return (Set) super.c(obj);
    }

    @Override // defpackage.aggz, defpackage.agom
    public final /* bridge */ /* synthetic */ Collection j() {
        return (Set) super.j();
    }
}
