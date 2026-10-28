package com.google.cardboard.sdk.qrcode;

import defpackage.lqd;
import defpackage.lqq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class QrCodeTrackerFactory {
    private final QrCodeTracker.Listener listener;

    public QrCodeTrackerFactory(QrCodeTracker.Listener listener) {
        this.listener = listener;
    }

    public lqd create(lqq lqqVar) {
        return new QrCodeTracker(this.listener);
    }
}
