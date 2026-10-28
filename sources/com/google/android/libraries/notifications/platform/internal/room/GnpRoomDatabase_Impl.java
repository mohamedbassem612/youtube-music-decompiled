package com.google.android.libraries.notifications.platform.internal.room;

import defpackage.dmg;
import defpackage.dmu;
import defpackage.ptt;
import defpackage.ptu;
import defpackage.ptv;
import defpackage.ptw;
import defpackage.ptx;
import defpackage.pty;
import defpackage.ptz;
import defpackage.pua;
import defpackage.pub;
import defpackage.puc;
import defpackage.pvh;
import defpackage.pvk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class GnpRoomDatabase_Impl extends GnpRoomDatabase {
    private volatile pvh m;

    @Override // defpackage.dmq
    protected final dmg a() {
        return new dmg(this, new HashMap(0), new HashMap(0), "gnp_accounts");
    }

    @Override // defpackage.dmq
    protected final /* synthetic */ dmu c() {
        return new puc(this);
    }

    @Override // defpackage.dmq
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(pvh.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.dmq
    public final Set j() {
        return new HashSet();
    }

    @Override // defpackage.dmq
    public final List u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ptu());
        arrayList.add(new ptv());
        arrayList.add(new ptw());
        arrayList.add(new ptx());
        arrayList.add(new pty());
        arrayList.add(new ptz());
        arrayList.add(new pua());
        arrayList.add(new pub());
        arrayList.add(new ptt());
        return arrayList;
    }

    @Override // com.google.android.libraries.notifications.platform.internal.room.GnpRoomDatabase
    public final pvh w() {
        pvh pvhVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new pvk(this);
            }
            pvhVar = this.m;
        }
        return pvhVar;
    }
}
