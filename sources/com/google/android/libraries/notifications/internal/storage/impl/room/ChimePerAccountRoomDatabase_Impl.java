package com.google.android.libraries.notifications.internal.storage.impl.room;

import defpackage.dmg;
import defpackage.dmu;
import defpackage.pga;
import defpackage.pgb;
import defpackage.pgd;
import defpackage.pgh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ChimePerAccountRoomDatabase_Impl extends ChimePerAccountRoomDatabase {
    private volatile pgd l;

    @Override // defpackage.dmq
    protected final dmg a() {
        return new dmg(this, new HashMap(0), new HashMap(0), "chime_thread_states");
    }

    @Override // defpackage.dmq
    protected final /* synthetic */ dmu c() {
        return new pgb(this);
    }

    @Override // defpackage.dmq
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(pgd.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.dmq
    public final Set j() {
        return new HashSet();
    }

    @Override // defpackage.dmq
    public final List u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pga());
        return arrayList;
    }

    @Override // com.google.android.libraries.notifications.internal.storage.impl.room.ChimePerAccountRoomDatabase
    public final pgd w() {
        pgd pgdVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new pgh(this);
            }
            pgdVar = this.l;
        }
        return pgdVar;
    }
}
