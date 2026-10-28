package defpackage;

import com.google.protobuf.MessageLite;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vlf implements qro {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vlf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.qro
    public final MessageLite a(tld tldVar, MessageLite messageLite) {
        aihf aihfVarCreateBuilder;
        int i = this.$cid;
        if (i == 0) {
            aihf builder = ((vlg) messageLite).toBuilder();
            int iP = tldVar.p("TEXT_COLOR", 0);
            builder.copyOnWrite();
            ((vlg) builder.instance).e = iP;
            int iP2 = tldVar.p("BACKGROUND_COLOR", 0);
            builder.copyOnWrite();
            ((vlg) builder.instance).f = iP2;
            int iP3 = tldVar.p("ALIGNMENT", 4);
            builder.copyOnWrite();
            ((vlg) builder.instance).g = iP3;
            int iP4 = tldVar.p("FONT_FAMILY", 0);
            builder.copyOnWrite();
            ((vlg) builder.instance).h = iP4;
            return (vlg) builder.build();
        }
        if (i == 1) {
            ainx ainxVar = (ainx) messageLite;
            Set<String> setT = tldVar.t("ids", null);
            if (setT == null || setT.isEmpty()) {
                if (ainxVar != null) {
                    return ainxVar;
                }
                ainx ainxVar2 = ainx.a;
                ainxVar2.getClass();
                return ainxVar2;
            }
            if (ainxVar == null || (aihfVarCreateBuilder = ainxVar.toBuilder()) == null) {
                aihfVarCreateBuilder = ainx.a.createBuilder();
                aihfVarCreateBuilder.getClass();
            }
            for (String str : setT) {
                aihf aihfVarCreateBuilder2 = ainw.a.createBuilder();
                str.getClass();
                int i2 = Integer.parseInt(str);
                aihfVarCreateBuilder2.copyOnWrite();
                ainw ainwVar = (ainw) aihfVarCreateBuilder2.instance;
                ainwVar.b |= 1;
                ainwVar.c = i2;
                aihfVarCreateBuilder.aD((ainw) aihfVarCreateBuilder2.build());
            }
            return (ainx) aihfVarCreateBuilder.build();
        }
        if (i == 2) {
            aihf builder2 = ((vlg) messageLite).toBuilder();
            String strS = tldVar.s("MOST_RECENT_PRESET_EFFECT_ID", null);
            builder2.copyOnWrite();
            vlg vlgVar = (vlg) builder2.instance;
            strS.getClass();
            vlgVar.j = strS;
            return (vlg) builder2.build();
        }
        if (i == 3) {
            aihf builder3 = ((vlg) messageLite).toBuilder();
            String strS2 = tldVar.s("recent_stickers", null);
            builder3.copyOnWrite();
            vlg vlgVar2 = (vlg) builder3.instance;
            strS2.getClass();
            vlgVar2.k = strS2;
            return (vlg) builder3.build();
        }
        if (i == 4) {
            aihf builder4 = ((vlg) messageLite).toBuilder();
            boolean zV = tldVar.v("REEL_WELCOME_V2_ALREADY_SEEN", false);
            builder4.copyOnWrite();
            ((vlg) builder4.instance).l = zV;
            return (vlg) builder4.build();
        }
        if (i != 5) {
            aihf builder5 = ((ainr) messageLite).toBuilder();
            if (tldVar.u("permissions_requested")) {
                builder5.aC(tldVar.t("permissions_requested", agpr.a));
            }
            return (ainr) builder5.build();
        }
        aihf builder6 = ((atpd) messageLite).toBuilder();
        String strS3 = tldVar.s("remote_id", "");
        builder6.copyOnWrite();
        atpd atpdVar = (atpd) builder6.instance;
        strS3.getClass();
        atpdVar.b |= 1;
        atpdVar.c = strS3;
        return (atpd) builder6.build();
    }
}
