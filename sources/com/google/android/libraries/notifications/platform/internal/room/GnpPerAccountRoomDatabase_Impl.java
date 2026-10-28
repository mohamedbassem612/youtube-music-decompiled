package com.google.android.libraries.notifications.platform.internal.room;

import defpackage.dmg;
import defpackage.dmu;
import defpackage.ptd;
import defpackage.ptg;
import defpackage.ptl;
import defpackage.ptm;
import defpackage.ptn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class GnpPerAccountRoomDatabase_Impl extends GnpPerAccountRoomDatabase {
    private volatile ptd l;

    @Override // defpackage.dmq
    protected final dmg a() {
        return new dmg(this, new HashMap(0), new HashMap(0), "threads");
    }

    @Override // defpackage.dmq
    protected final /* synthetic */ dmu c() {
        return new ptn(this);
    }

    @Override // defpackage.dmq
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(ptd.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.dmq
    public final Set j() {
        return new HashSet();
    }

    @Override // defpackage.dmq
    public final List u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ptl());
        arrayList.add(new ptm());
        return arrayList;
    }

    @Override // com.google.android.libraries.notifications.platform.internal.room.GnpPerAccountRoomDatabase
    public final ptd w() {
        ptd ptdVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new ptg(this);
            }
            ptdVar = this.l;
        }
        return ptdVar;
    }
}
