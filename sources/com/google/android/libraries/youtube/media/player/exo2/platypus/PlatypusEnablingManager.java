package com.google.android.libraries.youtube.media.player.exo2.platypus;

import android.net.Uri;
import android.text.TextUtils;
import defpackage.wiu;
import defpackage.wja;
import defpackage.ywn;
import defpackage.zhq;
import defpackage.zjr;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class PlatypusEnablingManager {
    private final zjr a;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    enum DecisionWithReason {
        ENABLED("u"),
        DISABLED_FOR_PLAYBACK("f"),
        DISABLED_DUE_TO_OFFLINE("o"),
        DISABLED_BY_PLAYER_CONFIG("dp"),
        DISABLED_BY_SABR_STREAMING_URI("su");

        public final String f;

        DecisionWithReason(String str) {
            this.f = str;
        }
    }

    public PlatypusEnablingManager(zjr zjrVar) {
        this.a = zjrVar;
    }

    private final DecisionWithReason c(wiu wiuVar, wja wjaVar) {
        if (wiuVar.at()) {
            return DecisionWithReason.ENABLED;
        }
        if (wjaVar.E() && this.a.W().j) {
            return DecisionWithReason.ENABLED;
        }
        if (!wiuVar.an()) {
            return DecisionWithReason.DISABLED_BY_PLAYER_CONFIG;
        }
        Optional optionalO = wjaVar.o();
        if (optionalO.isEmpty() || TextUtils.isEmpty(((Uri) optionalO.get()).getAuthority())) {
            return DecisionWithReason.DISABLED_BY_SABR_STREAMING_URI;
        }
        return (!wjaVar.q || this.a.W().i) ? DecisionWithReason.ENABLED : DecisionWithReason.DISABLED_DUE_TO_OFFLINE;
    }

    public final boolean a(wiu wiuVar, wja wjaVar) {
        return c(wiuVar, wjaVar) == DecisionWithReason.ENABLED;
    }

    public final boolean b(wiu wiuVar, wja wjaVar, ywn ywnVar) {
        DecisionWithReason decisionWithReasonC = c(wiuVar, wjaVar);
        ywnVar.l("pcmp", decisionWithReasonC.f);
        zhq zhqVar = zhq.ABR;
        if (decisionWithReasonC == DecisionWithReason.ENABLED) {
            return true;
        }
        if (this.a.l.m(11, 45637332L)) {
            wiuVar.j = true;
        }
        return false;
    }
}
