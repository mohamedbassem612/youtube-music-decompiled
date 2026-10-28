package com.google.android.libraries.notifications.platform.internal.room;

import defpackage.dmg;
import defpackage.dmu;
import defpackage.ptp;
import defpackage.pvs;
import defpackage.pvu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class GnpPerDeviceRoomDatabase_Impl extends GnpPerDeviceRoomDatabase {
    private volatile pvs l;

    @Override // defpackage.dmq
    protected final dmg a() {
        return new dmg(this, new HashMap(0), new HashMap(0), "gnp_experiments");
    }

    @Override // defpackage.dmq
    protected final /* synthetic */ dmu c() {
        return new ptp(this);
    }

    @Override // defpackage.dmq
    protected final Map h() {
        HashMap map = new HashMap();
        map.put(pvs.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // defpackage.dmq
    public final Set j() {
        return new HashSet();
    }

    @Override // defpackage.dmq
    public final List u() {
        return new ArrayList();
    }

    @Override // com.google.android.libraries.notifications.platform.internal.room.GnpPerDeviceRoomDatabase
    public final pvs w() {
        pvs pvsVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new pvu(this);
            }
            pvsVar = this.l;
        }
        return pvsVar;
    }
}
