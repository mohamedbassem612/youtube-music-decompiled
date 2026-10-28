package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class akhu implements weh {
    static final akht a;
    public static final weq b;
    private final akhw c;

    static {
        akht akhtVar = new akht();
        a = akhtVar;
        b = akhtVar;
    }

    public akhu(akhw akhwVar) {
        this.c = akhwVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new akhs(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof akhu) && this.c.equals(((akhu) obj).c);
    }

    public asnm getAuthorPhoto() {
        asnm asnmVar = this.c.n;
        return asnmVar == null ? asnm.a : asnmVar;
    }

    public akhy getCreatorGoalState() {
        akhy akhyVarA = akhy.a(this.c.d);
        return akhyVarA == null ? akhy.CREATOR_GOAL_STATE_INACTIVE : akhyVarA;
    }

    public Long getCurrentGoalCount() {
        return Long.valueOf(this.c.e);
    }

    public List getEmoteRewards() {
        return this.c.A;
    }

    public Long getEndTimestampMs() {
        return Long.valueOf(this.c.k);
    }

    public List getGoalBannerTexts() {
        return this.c.r;
    }

    public askp getGoalDescription() {
        askp askpVar = this.c.p;
        return askpVar == null ? askp.a : askpVar;
    }

    public asnm getGoalHeaderBackgroundImage() {
        asnm asnmVar = this.c.v;
        return asnmVar == null ? asnm.a : asnmVar;
    }

    public askp getGoalHeadlineText() {
        askp askpVar = this.c.t;
        return askpVar == null ? askp.a : askpVar;
    }

    public asnm getGoalIcon() {
        asnm asnmVar = this.c.q;
        return asnmVar == null ? asnm.a : asnmVar;
    }

    public String getGoalId() {
        return this.c.B;
    }

    public Long getGoalLevel() {
        return Long.valueOf(this.c.i);
    }

    public askp getGoalLevelProgressText() {
        askp askpVar = this.c.h;
        return askpVar == null ? askp.a : askpVar;
    }

    public askp getGoalLevelText() {
        askp askpVar = this.c.j;
        return askpVar == null ? askp.a : askpVar;
    }

    public askp getGoalSubheaderText() {
        askp askpVar = this.c.u;
        return askpVar == null ? askp.a : askpVar;
    }

    public askp getGoalTargetText() {
        askp askpVar = this.c.s;
        return askpVar == null ? askp.a : askpVar;
    }

    public Boolean getIsCreator() {
        return Boolean.valueOf(this.c.w);
    }

    public Boolean getIsXpGoal() {
        return Boolean.valueOf(this.c.C);
    }

    public Integer getProgressBarColor() {
        return Integer.valueOf(this.c.y);
    }

    public apji getProgressFlowButton() {
        apji apjiVar = this.c.x;
        return apjiVar == null ? apji.a : apjiVar;
    }

    public Float getProgressFraction() {
        return Float.valueOf(this.c.g);
    }

    public Long getServerTimestampMs() {
        return Long.valueOf(this.c.m);
    }

    public Boolean getShouldShowCountdown() {
        return Boolean.valueOf(this.c.l);
    }

    public asnm getSuperChatTierImage() {
        asnm asnmVar = this.c.o;
        return asnmVar == null ? asnm.a : asnmVar;
    }

    public apji getThemedTargetImage() {
        apji apjiVar = this.c.z;
        return apjiVar == null ? apji.a : apjiVar;
    }

    public Long getTotalGoalCount() {
        return Long.valueOf(this.c.f);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "CreatorGoalEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
