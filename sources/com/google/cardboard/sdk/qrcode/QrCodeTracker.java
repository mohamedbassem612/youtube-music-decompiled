package com.google.cardboard.sdk.qrcode;

import defpackage.lqd;
import defpackage.lqq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class QrCodeTracker extends lqd {
    private final Listener listener;

    /* JADX INFO: compiled from: PG */
    public interface Listener {
        void onQrCodeDetected(lqq lqqVar);
    }

    public QrCodeTracker(Listener listener) {
        this.listener = listener;
    }

    @Override // defpackage.lqd
    public void onNewItem(int i, lqq lqqVar) {
        if (lqqVar.c != null) {
            this.listener.onQrCodeDetected(lqqVar);
        }
    }
}
