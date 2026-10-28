package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acim extends ywy {
    private final abyd a;
    private final abmt b;

    public acim(abyd abydVar, abmt abmtVar) {
        this.a = abydVar;
        this.b = abmtVar;
    }

    @Override // defpackage.ywy, defpackage.ywz
    public final float b() {
        if (!this.b.aA()) {
            return this.m;
        }
        abyd abydVar = this.a;
        int i = awrn.a;
        abyc abycVar = (abyc) abydVar.c.get(new awqv(abxj.class));
        abxp abxpVarA = abycVar != null ? abycVar.a() : null;
        if (true != (abxpVarA instanceof abxj)) {
            abxpVarA = null;
        }
        abxj abxjVar = (abxj) abxpVarA;
        if (abxjVar == null) {
            abyc abycVar2 = (abyc) abyd.b.get(new awqv(abxj.class));
            abxp abxpVarA2 = abycVar2 != null ? abycVar2.a() : null;
            if (abxpVarA2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.youtube.player.settings.control.models.PlayerSettingModel.PlaybackRateSettingModel");
            }
            abxjVar = (abxj) abxpVarA2;
        }
        return abxjVar.d;
    }

    @Override // defpackage.ywy, defpackage.ywz
    public final float c() {
        if (this.b.Y()) {
            abyd abydVar = this.a;
            int i = awrn.a;
            abyc abycVar = (abyc) abydVar.c.get(new awqv(abxi.class));
            abxp abxpVarA = abycVar != null ? abycVar.a() : null;
            if (true != (abxpVarA instanceof abxi)) {
                abxpVarA = null;
            }
            if (((abxi) abxpVarA) == null) {
                abyc abycVar2 = (abyc) abyd.b.get(new awqv(abxi.class));
                abxp abxpVarA2 = abycVar2 != null ? abycVar2.a() : null;
                if (abxpVarA2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.youtube.player.settings.control.models.PlayerSettingModel.AudioSettingModel");
                }
            }
        }
        return this.l;
    }

    @Override // defpackage.ywy, defpackage.ywz
    public final arfb p() {
        if (!this.b.bb()) {
            return this.s;
        }
        abyd abydVar = this.a;
        int i = awrn.a;
        abyc abycVar = (abyc) abydVar.c.get(new awqv(abxo.class));
        abxp abxpVarA = abycVar != null ? abycVar.a() : null;
        if (true != (abxpVarA instanceof abxo)) {
            abxpVarA = null;
        }
        abxo abxoVar = (abxo) abxpVarA;
        if (abxoVar == null) {
            abyc abycVar2 = (abyc) abyd.b.get(new awqv(abxo.class));
            abxp abxpVarA2 = abycVar2 != null ? abycVar2.a() : null;
            if (abxpVarA2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.youtube.player.settings.control.models.PlayerSettingModel.VideoQualitySettingModel");
            }
            abxoVar = (abxo) abxpVarA2;
        }
        Objects.checkIndex(0, 3);
        if (abxoVar instanceof abxl) {
            return ((abxl) abxoVar).d;
        }
        if (abxoVar instanceof abxm) {
            return ((abxm) abxoVar).a;
        }
        return null;
    }

    @Override // defpackage.ywy, defpackage.ywz
    public final Integer q() {
        if (!this.b.bb()) {
            return this.r;
        }
        abyd abydVar = this.a;
        int i = awrn.a;
        abyc abycVar = (abyc) abydVar.c.get(new awqv(abxo.class));
        abxp abxpVarA = abycVar != null ? abycVar.a() : null;
        if (true != (abxpVarA instanceof abxo)) {
            abxpVarA = null;
        }
        abxo abxoVar = (abxo) abxpVarA;
        if (abxoVar == null) {
            abyc abycVar2 = (abyc) abyd.b.get(new awqv(abxo.class));
            abxp abxpVarA2 = abycVar2 != null ? abycVar2.a() : null;
            if (abxpVarA2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.youtube.player.settings.control.models.PlayerSettingModel.VideoQualitySettingModel");
            }
            abxoVar = (abxo) abxpVarA2;
        }
        if (abxoVar instanceof abxl) {
            return Integer.valueOf(((abxl) abxoVar).a);
        }
        return null;
    }

    @Override // defpackage.ywy, defpackage.ywz
    public final boolean t() {
        if (!this.b.aV()) {
            return this.u;
        }
        abyd abydVar = this.a;
        int i = awrn.a;
        abyc abycVar = (abyc) abydVar.c.get(new awqv(abxk.class));
        abxp abxpVarA = abycVar != null ? abycVar.a() : null;
        if (true != (abxpVarA instanceof abxk)) {
            abxpVarA = null;
        }
        abxk abxkVar = (abxk) abxpVarA;
        if (abxkVar == null) {
            abyc abycVar2 = (abyc) abyd.b.get(new awqv(abxk.class));
            abxp abxpVarA2 = abycVar2 != null ? abycVar2.a() : null;
            if (abxpVarA2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.youtube.player.settings.control.models.PlayerSettingModel.SkipSilenceSettingModel");
            }
            abxkVar = (abxk) abxpVarA2;
        }
        return abxkVar.b;
    }
}
