package com.google.android.libraries.youtube.media.player.exo2.platypus;

import defpackage.tgr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class NetworkPriorityManager {
    private boolean a;
    private final Object b = new Object();
    private final tgr c;

    public NetworkPriorityManager(tgr tgrVar) {
        this.c = tgrVar;
    }

    final void a(boolean z) {
        synchronized (this.b) {
            boolean z2 = this.a;
            if (z) {
                if (!z2) {
                    this.c.d(0);
                }
            } else if (z2) {
                this.c.g(0);
            }
            this.a = z;
        }
    }
}
