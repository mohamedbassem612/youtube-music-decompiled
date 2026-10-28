package androidx.work.impl;

import defpackage.awmi;
import defpackage.awmp;
import defpackage.awno;
import defpackage.awqv;
import defpackage.awrn;
import defpackage.dmg;
import defpackage.dmu;
import defpackage.ebb;
import defpackage.ebc;
import defpackage.ebd;
import defpackage.ebe;
import defpackage.ebf;
import defpackage.ebg;
import defpackage.ebh;
import defpackage.ebi;
import defpackage.ebj;
import defpackage.ebk;
import defpackage.ebl;
import defpackage.edw;
import defpackage.eea;
import defpackage.eed;
import defpackage.eeh;
import defpackage.eel;
import defpackage.eeo;
import defpackage.eet;
import defpackage.eff;
import defpackage.py;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private final awmi l = new awmp(new py(this, 19));
    private final awmi m = new awmp(new py(this, 20));
    private final awmi n = new awmp(new ebk(this, 1));
    private final awmi o = new awmp(new ebk(this, 0));
    private final awmi p = new awmp(new ebk(this, 2));
    private final awmi q = new awmp(new ebk(this, 3));
    private final awmi r = new awmp(new ebk(this, 4));
    private final awmi s = new awmp(new ebk(this, 5));

    @Override // androidx.work.impl.WorkDatabase
    public final eel A() {
        return (eel) this.p.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eeo B() {
        return (eeo) this.q.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eet C() {
        return (eet) this.l.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eff D() {
        return (eff) this.n.a();
    }

    @Override // defpackage.dmq
    protected final dmg a() {
        return new dmg(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.dmq
    public final /* synthetic */ dmu c() {
        return new ebl(this);
    }

    @Override // defpackage.dmq
    public final List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ebb());
        arrayList.add(new ebc());
        arrayList.add(new ebd());
        arrayList.add(new ebe());
        arrayList.add(new ebf());
        arrayList.add(new ebg());
        arrayList.add(new ebh());
        arrayList.add(new ebi());
        arrayList.add(new ebj());
        return arrayList;
    }

    @Override // defpackage.dmq
    protected final Map g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = awrn.a;
        awqv awqvVar = new awqv(eet.class);
        awno awnoVar = awno.a;
        linkedHashMap.put(awqvVar, awnoVar);
        linkedHashMap.put(new awqv(edw.class), awnoVar);
        linkedHashMap.put(new awqv(eff.class), awnoVar);
        linkedHashMap.put(new awqv(eeh.class), awnoVar);
        linkedHashMap.put(new awqv(eel.class), awnoVar);
        linkedHashMap.put(new awqv(eeo.class), awnoVar);
        linkedHashMap.put(new awqv(eea.class), awnoVar);
        linkedHashMap.put(new awqv(eed.class), awnoVar);
        return linkedHashMap;
    }

    @Override // defpackage.dmq
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final edw w() {
        return (edw) this.m.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eea x() {
        return (eea) this.r.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eed y() {
        return (eed) this.s.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final eeh z() {
        return (eeh) this.o.a();
    }
}
