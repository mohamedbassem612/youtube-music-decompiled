package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sdp implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ sdp(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                wgi wgiVar = (wgi) obj;
                if (wgiVar != null) {
                    return agkj.j("com.google.android.libraries.youtube.innertube.endpoint.tag", wgiVar.a);
                }
                return null;
            case 1:
                wgi wgiVar2 = (wgi) obj;
                if (wgiVar2 == null) {
                    return null;
                }
                ajwo ajwoVar = wgiVar2.a.w;
                return ajwoVar == null ? ajwo.a : ajwoVar;
            case 2:
                return new Exception((Throwable) obj);
            case 3:
                return new Exception((Throwable) obj);
            case 4:
                return (Integer) obj;
            case 5:
                return (Boolean) obj;
            case 6:
                return Boolean.valueOf(((atos) obj).c > 0);
            case 7:
                uzd uzdVar = (uzd) obj;
                uze uzeVarA = uzf.a();
                if ((uzdVar.b & 2) != 0) {
                    uzc uzcVar = uzdVar.d;
                    if (uzcVar == null) {
                        uzcVar = uzc.a;
                    }
                    uzeVarA.b(agke.n(uzcVar.c));
                    uzc uzcVar2 = uzdVar.d;
                    if (((uzcVar2 == null ? uzc.a : uzcVar2).b & 1) != 0) {
                        if (uzcVar2 == null) {
                            uzcVar2 = uzc.a;
                        }
                        apji apjiVar = uzcVar2.d;
                        if (apjiVar == null) {
                            apjiVar = apji.a;
                        }
                        uzeVarA.c = apjiVar;
                    }
                }
                if ((uzdVar.b & 1) != 0) {
                    uzc uzcVar3 = uzdVar.c;
                    if (uzcVar3 == null) {
                        uzcVar3 = uzc.a;
                    }
                    uzeVarA.c(agke.n(uzcVar3.c));
                    uzc uzcVar4 = uzdVar.c;
                    if (((uzcVar4 == null ? uzc.a : uzcVar4).b & 1) != 0) {
                        if (uzcVar4 == null) {
                            uzcVar4 = uzc.a;
                        }
                        apji apjiVar2 = uzcVar4.d;
                        if (apjiVar2 == null) {
                            apjiVar2 = apji.a;
                        }
                        uzeVarA.d = apjiVar2;
                    }
                }
                return uzeVarA.a();
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                vlg vlgVar = (vlg) obj;
                if (vlgVar == null) {
                    return new ArrayList();
                }
                String str = vlgVar.k;
                if (TextUtils.isEmpty(str)) {
                    return new ArrayList();
                }
                try {
                    aqcz aqczVar = (aqcz) aihn.parseFrom(aqcz.a, Base64.decode(str, 0), ExtensionRegistryLite.getGeneratedRegistry());
                    ArrayList arrayList = new ArrayList(aqczVar.b.size());
                    arrayList.addAll(aqczVar.b);
                    return arrayList;
                } catch (aiik e) {
                    ((agrc) ((agrc) ((agrc) vhd.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/videoeffects/fragment/RecentStickerTracker", "convertBytesToRenderers", (char) 159, "RecentStickerTracker.java")).t("Error reading recent stickers.");
                    return new ArrayList();
                }
            case 11:
                return Boolean.valueOf(((vlg) obj).b > 0);
            case 12:
                return ((vot) obj).a;
            case 13:
                return ((vot) obj).b;
            case 14:
                return ((vot) obj).b;
            case 15:
                return ((vot) obj).d;
            case 16:
                return ((vot) obj).a;
            case 17:
                return ((xsc) obj).i();
            case 18:
                return ((xsc) obj).b;
            case 19:
                return null;
            default:
                aihf aihfVarCreateBuilder = InnertubeContext$InnerTubeContext.a.createBuilder();
                aihf aihfVarCreateBuilder2 = alor.a.createBuilder();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aihfVarCreateBuilder2.copyOnWrite();
                alor alorVar = (alor) aihfVarCreateBuilder2.instance;
                alorVar.b |= 4;
                alorVar.d = zBooleanValue;
                aihfVarCreateBuilder.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.instance;
                alor alorVar2 = (alor) aihfVarCreateBuilder2.build();
                alorVar2.getClass();
                innertubeContext$InnerTubeContext.e = alorVar2;
                innertubeContext$InnerTubeContext.b |= 4;
                return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.build();
        }
    }
}
