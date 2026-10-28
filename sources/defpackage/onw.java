package defpackage;

import android.util.Base64;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class onw implements qro {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ onw(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, sya] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, sya] */
    /* JADX WARN: Type inference failed for: r8v11, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    @Override // defpackage.qro
    public final MessageLite a(tld tldVar, MessageLite messageLite) {
        ajha ajhaVar;
        int i = this.$cid;
        if (i == 0) {
            aihf aihfVarCreateBuilder = ojc.a.createBuilder();
            agqr it = tldVar.r().entrySet().iterator();
            Object obj = this.a;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                try {
                    String str = (String) entry.getValue();
                    str.getClass();
                    try {
                        ojb ojbVar = ojb.a;
                        aihfVarCreateBuilder.W((String) entry.getKey(), (ojb) qnl.aM(str, aihn.getParserForClass(ojb.class)));
                    } catch (aiik e) {
                        onb.c("SharedPreferences shared files metadata had unexpected format: %s", e);
                        ((ong) obj).j(1084);
                    }
                } catch (ClassCastException | NullPointerException e2) {
                    onb.c("SharedPreferences shared files metadata key wasn't a string: %s", e2);
                    ((ong) obj).j(1083);
                }
            }
            return (ojc) aihfVarCreateBuilder.build();
        }
        if (i == 1) {
            aihf aihfVarCreateBuilder2 = oiu.a.createBuilder();
            agqr it2 = tldVar.r().entrySet().iterator();
            Object obj2 = this.a;
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                try {
                    String str2 = (String) entry2.getValue();
                    str2.getClass();
                    try {
                        oip oipVar = oip.a;
                        aihfVarCreateBuilder2.U((String) entry2.getKey(), (oip) qnl.aM(str2, aihn.getParserForClass(oip.class)));
                    } catch (aiik e3) {
                        onb.c("SharedPreferences file groups metadata had unexpected format: %s", e3);
                        ((ong) obj2).j(1084);
                    }
                } catch (ClassCastException | NullPointerException e4) {
                    onb.c("SharedPreferences file groups metadata key wasn't a string: %s", e4);
                    ((ong) obj2).j(1083);
                }
            }
            return (oiu) aihfVarCreateBuilder2.build();
        }
        ajha ajhaVar2 = null;
        try {
            if (i == 2) {
                String strS = tldVar.s("com.google.android.libraries.youtube.innertube.pref.player_config_supplier", null);
                ?? r6 = this.a;
                if (strS == null) {
                    return messageLite;
                }
                aoqd aoqdVar = (aoqd) ((aihf) aoqd.a.createBuilder().mergeFrom(Base64.decode(strS, 0), ExtensionRegistryLite.getGeneratedRegistry())).build();
                aihf builder = ((atov) messageLite).toBuilder();
                builder.copyOnWrite();
                atov atovVar = (atov) builder.instance;
                aoqdVar.getClass();
                atovVar.c = aoqdVar;
                atovVar.b |= 1;
                return r6.a(messageLite, (atov) builder.build());
            }
            if (i == 3) {
                String strS2 = tldVar.s("attribution_data", null);
                ?? r7 = this.a;
                if (strS2 == null) {
                    return messageLite;
                }
                try {
                    ajhaVar = (ajha) aihn.parseFrom(ajha.a, Base64.decode(strS2, 0), ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik unused) {
                    ajhaVar = null;
                }
                if (ajhaVar != null && ajhaVar.b.size() > 0) {
                    ajhaVar2 = ajhaVar;
                }
                aihf builder2 = ((atov) messageLite).toBuilder();
                builder2.copyOnWrite();
                atov atovVar2 = (atov) builder2.instance;
                ajhaVar2.getClass();
                atovVar2.d = ajhaVar2;
                atovVar2.b |= 2;
                return r7.a(messageLite, (atov) builder2.build());
            }
            aihf builder3 = ((aihn) this.a).toBuilder();
            if (tldVar.u(aawb.QUICK_SEEK_PREFERENCE_STRING)) {
                long j = Long.parseLong(tldVar.s(aawb.QUICK_SEEK_PREFERENCE_STRING, null));
                aihf aihfVarCreateBuilder3 = aigu.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                ((aigu) aihfVarCreateBuilder3.instance).b = j;
                aigu aiguVar = (aigu) aihfVarCreateBuilder3.build();
                builder3.copyOnWrite();
                atpu atpuVar = (atpu) builder3.instance;
                aiguVar.getClass();
                atpuVar.c = aiguVar;
                atpuVar.b |= 1;
            }
            if (tldVar.u("nerd_stats_enabled")) {
                boolean zV = tldVar.v("nerd_stats_enabled", false);
                builder3.copyOnWrite();
                atpu atpuVar2 = (atpu) builder3.instance;
                atpuVar2.b |= 2;
                atpuVar2.d = zV;
            }
            if (tldVar.u("autonav")) {
                boolean zV2 = tldVar.v("autonav", true);
                builder3.copyOnWrite();
                atpu atpuVar3 = (atpu) builder3.instance;
                atpuVar3.b |= 4;
                atpuVar3.e = zV2;
            }
            return (atpu) builder3.build();
        } catch (aiik | IllegalArgumentException | NullPointerException unused2) {
            return messageLite;
        }
    }
}
