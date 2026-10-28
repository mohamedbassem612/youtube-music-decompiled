package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajpw implements weh {
    static final ajpv a;
    public static final weq b;
    public final ajpx c;

    static {
        ajpv ajpvVar = new ajpv();
        a = ajpvVar;
        b = ajpvVar;
    }

    public ajpw(ajpx ajpxVar) {
        this.c = ajpxVar;
    }

    public static ajpu e(ajpx ajpxVar) {
        return new ajpu(ajpxVar.toBuilder());
    }

    public static ajpu f(String str) {
        str.getClass();
        ahno.P(!str.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = ajpx.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajpx ajpxVar = (ajpx) aihfVarCreateBuilder.instance;
        ajpxVar.c |= 1;
        ajpxVar.d = str;
        return new ajpu(aihfVarCreateBuilder);
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.d;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new ajpu(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajpw) && this.c.equals(((ajpw) obj).c);
    }

    public String getBlobEncryptionId() {
        return this.c.i;
    }

    public ajps getChannelCreationFlowState() {
        ajps ajpsVarA = ajps.a(this.c.z);
        return ajpsVarA == null ? ajps.CHANNEL_CREATION_FLOW_STATE_UNSPECIFIED : ajpsVarA;
    }

    public ajpy getChannelCreationHeaderState() {
        ajpy ajpyVarA = ajpy.a(this.c.y);
        return ajpyVarA == null ? ajpy.CHANNEL_CREATION_HEADER_STATE_UNKNOWN : ajpyVarA;
    }

    public String getClientPhotoFilePath() {
        return this.c.h;
    }

    public String getErrorMessage() {
        return this.c.f;
    }

    public String getGeneratedHandleFromName() {
        return this.c.v;
    }

    public alay getHandleUnavailableErrorMessage() {
        alay alayVar = this.c.q;
        return alayVar == null ? alay.a : alayVar;
    }

    public Boolean getHasHandleChanged() {
        return Boolean.valueOf(this.c.t);
    }

    public Boolean getIsCreateChannelLoading() {
        return Boolean.valueOf(this.c.e);
    }

    public Boolean getIsEditHandleOntapDisabled() {
        return Boolean.valueOf(this.c.n);
    }

    public Boolean getIsEditNameOntapDisabled() {
        return Boolean.valueOf(this.c.m);
    }

    public Boolean getIsHandleCheckLoading() {
        return Boolean.valueOf(this.c.p);
    }

    public Boolean getIsHandleChecked() {
        return Boolean.valueOf(this.c.x);
    }

    public Boolean getIsHandleFieldFocused() {
        return Boolean.valueOf(this.c.w);
    }

    public Boolean getIsHandleInvalid() {
        return Boolean.valueOf(this.c.r);
    }

    public Boolean getIsHandleTooLongMessageOn() {
        return Boolean.valueOf(this.c.o);
    }

    public Boolean getIsNameSubpageSpinnerOn() {
        return Boolean.valueOf(this.c.u);
    }

    public Boolean getIsNameTooLongMessageOn() {
        return Boolean.valueOf(this.c.l);
    }

    public Boolean getIsWaitMessageOn() {
        return Boolean.valueOf(this.c.k);
    }

    public aodg getObakeImageSourceType() {
        aodg aodgVarA = aodg.a(this.c.j);
        return aodgVarA == null ? aodg.OBAKE_IMAGE_SOURCE_TYPE_UNKNOWN : aodgVarA;
    }

    public aonc getPhotoUploadStatus() {
        aonc aoncVarA = aonc.a(this.c.g);
        return aoncVarA == null ? aonc.PHOTO_UPLOAD_STATUS_UNSPECIFIED : aoncVarA;
    }

    public String getPrevRecommendedHandle() {
        return this.c.s;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ChannelCreationFormStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
