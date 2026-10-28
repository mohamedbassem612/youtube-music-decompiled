package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;
import j$.net.URLDecoder;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aegr extends aedi {
    final /* synthetic */ Map a;
    final /* synthetic */ String b;
    final /* synthetic */ wby c;
    final /* synthetic */ aegs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aegr(aegs aegsVar, Map map, String str, wby wbyVar) {
        super(null);
        this.a = map;
        this.b = str;
        this.c = wbyVar;
        this.d = aegsVar;
    }

    @Override // defpackage.aedi
    public final void J(aami aamiVar, Uri uri) {
        Optional optionalEmpty;
        aegs aegsVar = this.d;
        boolean zF = aeho.f(uri.toString(), aegsVar.A);
        Map map = this.a;
        String str = this.b;
        wby wbyVar = this.c;
        if (zF) {
            List listH = agfm.b(',').h(ahno.Z(aamiVar.c()));
            try {
                arjt arjtVar = (arjt) aihn.parseFrom(arjt.a, Base64.decode((String) listH.get(0), 2), ExtensionRegistryLite.getGeneratedRegistry());
                ajwo ajwoVar = (ajwo) map.get(arjtVar.d);
                if (ajwoVar != null) {
                    if ((arjtVar.b & 4) != 0) {
                        arjp arjpVarE = arjr.e(wfs.g(441, String.format("%s_%s", str, arjtVar.d)));
                        arjpVarE.am(arjtVar.e);
                        arjr arjrVarAn = arjpVarE.an();
                        wer werVarE = wbyVar.e();
                        werVarE.e(arjrVarAn);
                        werVarE.b().G();
                    }
                    String str2 = arjtVar.d;
                    if (aegsVar.o != null) {
                        aegsVar.B.c(aeho.b(ajwoVar, aegsVar.r, aegsVar.s), agkj.j("com.google.android.libraries.youtube.logging.interaction_logger", aegsVar.o));
                        return;
                    } else {
                        aegsVar.B.a(aeho.b(ajwoVar, aegsVar.r, aegsVar.s));
                        return;
                    }
                }
                String str3 = arjtVar.d;
                int iHashCode = str3.hashCode();
                if (iHashCode == -1995840757) {
                    if (str3.equals("yt-mini-app-confirm-navigate-to-new-mini-app")) {
                        agqs agqsVarListIterator = agke.n(aegsVar.i).listIterator(0);
                        while (agqsVarListIterator.hasNext()) {
                            ((aego) agqsVarListIterator.next()).b();
                        }
                        return;
                    }
                    return;
                }
                if (iHashCode != -1981052350) {
                    if (iHashCode == 11634481 && str3.equals("yt-mini-app-cancel-navigate-to-new-mini-app")) {
                        agqs agqsVarListIterator2 = agke.n(aegsVar.i).listIterator(0);
                        while (agqsVarListIterator2.hasNext()) {
                            ((aego) agqsVarListIterator2.next()).a();
                        }
                        return;
                    }
                    return;
                }
                if (str3.equals("yt-mini-app-game-audio-data-received")) {
                    listH.size();
                    String str4 = arjtVar.e;
                    if (ahno.aa(str4)) {
                        optionalEmpty = Optional.empty();
                    } else {
                        try {
                            optionalEmpty = Optional.of(Base64.decode(URLDecoder.decode(str4, StandardCharsets.UTF_8), 8));
                        } catch (IllegalArgumentException e) {
                            zvl zvlVar = aegsVar.k;
                            zvj zvjVarA = zvk.a();
                            zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                            zvjVarA.j = 51;
                            zvjVarA.d("IllegalArgumentException while decoding serializedAdditionalMetadata for decodeSerializedMetadata: ".concat(String.valueOf(e.getMessage() == null ? "no error message" : e.getMessage())));
                            zvlVar.a(zvjVarA.a());
                            optionalEmpty = Optional.empty();
                        }
                    }
                    adha adhaVar = new adha(aegsVar, 9);
                    if (true == optionalEmpty.isPresent()) {
                        Object obj = optionalEmpty.get();
                        Object obj2 = adhaVar.a;
                        try {
                            optionalEmpty = Optional.of((anhz) aihn.parseFrom(anhz.a, (byte[]) obj, ExtensionRegistryLite.getGeneratedRegistry()));
                        } catch (aiik e2) {
                            zvl zvlVar2 = ((aegs) obj2).k;
                            zvj zvjVarA2 = zvk.a();
                            zvjVarA2.c(ajtv.ERROR_LEVEL_WARNING);
                            zvjVarA2.j = 51;
                            zvjVarA2.d("InvalidProtocolBufferException while decoding MiniAppMetadata for parseMiniAppWebToNativeParams: ".concat(String.valueOf(e2.getMessage() != null ? e2.getMessage() : "no error message")));
                            zvlVar2.a(zvjVarA2.a());
                            optionalEmpty = Optional.empty();
                        }
                    }
                    if (true == optionalEmpty.isPresent()) {
                        anhy anhyVar = ((anhz) optionalEmpty.get()).b;
                        if (anhyVar == null) {
                            anhyVar = anhy.a;
                        }
                        String str5 = anhyVar.b;
                        optionalEmpty = Optional.of(Base64.decode(str5.substring(str5.indexOf(",") + 1), 0));
                    }
                    if (true == optionalEmpty.isPresent()) {
                        optionalEmpty.get();
                    }
                }
            } catch (aiik unused) {
            }
        }
    }
}
