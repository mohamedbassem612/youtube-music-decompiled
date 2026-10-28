package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class yci extends awrb implements awqp {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yci(Object obj, int i) {
        super(7, obj, yad.class, "create", "create(Lcom/google/android/libraries/youtube/mdx/model/MdxCastScreen;Lcom/google/android/libraries/youtube/mdx/remote/internal/MdxSessionStatusListener;Lcom/google/android/libraries/youtube/mdx/remote/MdxSessionConnectionFlowEventLogger;Lcom/google/protos/youtube/api/innertube/MdxEnums$MdxSessionSource;Ljava/lang/String;ILjava/lang/String;)Lcom/google/android/libraries/youtube/mdx/remote/internal/CastSession;", 0);
        this.$cid = i;
    }

    @Override // defpackage.awqp
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i = this.$cid;
        if (i == 0) {
            return ((yad) this.receiver).a((xvj) obj, (ycp) obj2, (ycp) obj3, (amyv) obj4, (String) obj5, ((Number) obj6).intValue(), (String) obj7);
        }
        if (i == 1) {
            return ((xzx) this.receiver).a((xvi) obj, (ycp) obj2, (ycp) obj3, (amyv) obj4, ((Number) obj6).intValue(), (String) obj7);
        }
        if (i == 2) {
            return ((ybm) this.receiver).a((xvk) obj, (ycp) obj2, (ycp) obj3, (amyv) obj4, (String) obj5, ((Number) obj6).intValue(), (String) obj7);
        }
        if (i == 3) {
            return ((yaw) this.receiver).a((xvn) obj, (ycp) obj2, (ycp) obj3, (amyv) obj4, (String) obj5, ((Number) obj6).intValue(), (String) obj7);
        }
        ycp ycpVar = (ycp) obj2;
        ycpVar.getClass();
        return ((yce) this.receiver).a((xvp) obj, ycpVar, (ycp) obj3, (amyv) obj4, (String) obj5, ((Number) obj6).intValue(), (String) obj7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yci(Object obj, int i, byte[] bArr) {
        super(7, obj, xzx.class, "create", "create(Lcom/google/android/libraries/youtube/mdx/model/MdxAutoconnectScreen;Lcom/google/android/libraries/youtube/mdx/remote/internal/MdxSessionStatusListener;Lcom/google/android/libraries/youtube/mdx/remote/MdxSessionConnectionFlowEventLogger;Lcom/google/protos/youtube/api/innertube/MdxEnums$MdxSessionSource;Ljava/lang/String;ILjava/lang/String;)Lcom/google/android/libraries/youtube/mdx/remote/internal/AutoconnectSession;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yci(Object obj, int i, char[] cArr) {
        super(7, obj, ybm.class, "create", "create(Lcom/google/android/libraries/youtube/mdx/model/MdxCloudScreen;Lcom/google/android/libraries/youtube/mdx/remote/internal/MdxSessionStatusListener;Lcom/google/android/libraries/youtube/mdx/remote/MdxSessionConnectionFlowEventLogger;Lcom/google/protos/youtube/api/innertube/MdxEnums$MdxSessionSource;Ljava/lang/String;ILjava/lang/String;)Lcom/google/android/libraries/youtube/mdx/remote/internal/MdxCloudSession;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yci(Object obj, int i, int[] iArr) {
        super(7, obj, yce.class, "create", "create(Lcom/google/android/libraries/youtube/mdx/model/MdxRemoteScreen;Lcom/google/android/libraries/youtube/mdx/remote/internal/MdxSessionStatusListener;Lcom/google/android/libraries/youtube/mdx/remote/MdxSessionConnectionFlowEventLogger;Lcom/google/protos/youtube/api/innertube/MdxEnums$MdxSessionSource;Ljava/lang/String;ILjava/lang/String;)Lcom/google/android/libraries/youtube/mdx/remote/internal/MdxRemoteSession;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yci(Object obj, int i, short[] sArr) {
        super(7, obj, yaw.class, "create", "create(Lcom/google/android/libraries/youtube/mdx/model/MdxDialScreen;Lcom/google/android/libraries/youtube/mdx/remote/internal/MdxSessionStatusListener;Lcom/google/android/libraries/youtube/mdx/remote/MdxSessionConnectionFlowEventLogger;Lcom/google/protos/youtube/api/innertube/MdxEnums$MdxSessionSource;Ljava/lang/String;ILjava/lang/String;)Lcom/google/android/libraries/youtube/mdx/remote/internal/DialSession;", 0);
        this.$cid = i;
    }
}
