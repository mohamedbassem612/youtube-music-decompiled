package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.nio.file.FileSystems;
import j$.nio.file.Files;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atqn {
    private atqn() {
    }

    public static final /* synthetic */ void A(auhq auhqVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((auhs) auhqVar.instance).e);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ void B(auhq auhqVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((auhs) auhqVar.instance).d);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static int C(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 3;
        }
        return 2;
    }

    public static final /* synthetic */ asew D(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (asew) aihnVarBuild;
    }

    public static final void E(anoe anoeVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asew asewVar = (asew) aihfVar.instance;
        asew asewVar2 = asew.a;
        asewVar.c = anoeVar;
        asewVar.b |= 1;
    }

    public static final void F(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asew asewVar = (asew) aihfVar.instance;
        asew asewVar2 = asew.a;
        asewVar.b |= 4;
        asewVar.e = str;
    }

    public static final void G(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asew asewVar = (asew) aihfVar.instance;
        asew asewVar2 = asew.a;
        asewVar.b |= 2;
        asewVar.d = str;
    }

    public static final /* synthetic */ void H(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aseq) aihfVar.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ void I(asek asekVar, aihf aihfVar) {
        asekVar.getClass();
        aihfVar.copyOnWrite();
        asem asemVar = (asem) aihfVar.instance;
        asem asemVar2 = asem.a;
        asemVar.a();
        asemVar.c.add(asekVar);
    }

    public static final /* synthetic */ void J(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((asem) aihfVar.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ asek K(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (asek) aihnVarBuild;
    }

    public static final void L(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asek asekVar = (asek) aihfVar.instance;
        asek asekVar2 = asek.a;
        asekVar.b |= 1;
        asekVar.c = str;
    }

    public static final void M(asej asejVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asek asekVar = (asek) aihfVar.instance;
        asek asekVar2 = asek.a;
        asekVar.e = asejVar;
        asekVar.b |= 4;
    }

    public static final /* synthetic */ asej N(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (asej) aihnVarBuild;
    }

    public static final void O(askp askpVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asej asejVar = (asej) aihfVar.instance;
        asej asejVar2 = asej.a;
        asejVar.h = askpVar;
        asejVar.b |= 32;
    }

    public static final void P(askp askpVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asej asejVar = (asej) aihfVar.instance;
        asej asejVar2 = asej.a;
        asejVar.e = askpVar;
        asejVar.b |= 4;
    }

    public static final void Q(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asej asejVar = (asej) aihfVar.instance;
        asej asejVar2 = asej.a;
        asejVar.d = i - 1;
        asejVar.b |= 2;
    }

    public static final void R(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asej asejVar = (asej) aihfVar.instance;
        asej asejVar2 = asej.a;
        asejVar.c = i - 1;
        asejVar.b |= 1;
    }

    public static final /* synthetic */ aseg S(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (aseg) aihnVarBuild;
    }

    public static final void T(akll akllVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        aseg asegVar = (aseg) aihfVar.instance;
        aseg asegVar2 = aseg.a;
        asegVar.c = akllVar;
        asegVar.b |= 2;
    }

    public static /* synthetic */ String U(int i) {
        switch (i) {
            case 1:
                return "YT_SYS_MEASUREMENT_REFERENCE_UNSPECIFIED";
            case 2:
                return "YT_SYS_MEASUREMENT_REFERENCE_ACTION_HEIGHT_COMPACT";
            case 3:
                return "YT_SYS_MEASUREMENT_REFERENCE_ACTION_HEIGHT_HERO";
            case 4:
                return "YT_SYS_MEASUREMENT_REFERENCE_ACTION_HEIGHT_PROMINENT";
            case 5:
                return "YT_SYS_MEASUREMENT_REFERENCE_ACTION_HEIGHT_STANDARD";
            case 6:
                return "YT_SYS_MEASUREMENT_REFERENCE_ACTION_HEIGHT_TINY";
            case 7:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_COL_GAP_MED";
            case 8:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_COL_GAP_WIDE";
            case 9:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_MARGIN_MED";
            case 10:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_MARGIN_SMALL";
            case 11:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_MARGIN_WIDE";
            case 12:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_MAX_WIDTH_MED";
            case 13:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_MAX_WIDTH_WIDE";
            case 14:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_ROW_GAP_MED";
            case 15:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_ROW_GAP_SMALL";
            case 16:
                return "YT_SYS_MEASUREMENT_REFERENCE_FEED_ROW_GAP_WIDE";
            case 17:
                return "YT_SYS_MEASUREMENT_REFERENCE_SHELF_ITEM_GAP_MED";
            case 18:
                return "YT_SYS_MEASUREMENT_REFERENCE_SHELF_ITEM_GAP_SMALL";
            case 19:
                return "YT_SYS_MEASUREMENT_REFERENCE_SHELF_ITEM_GAP_WIDE";
            case 20:
                return "YT_SYS_MEASUREMENT_REFERENCE_SHELF_PEEK_MED";
            case 21:
                return "YT_SYS_MEASUREMENT_REFERENCE_SHELF_PEEK_SMALL";
            case 22:
                return "YT_SYS_MEASUREMENT_REFERENCE_SHELF_PEEK_WIDE";
            case 23:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_GAP_ACCESSORY_TEXT_SPACING_COMPACT";
            case 24:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_GAP_ACCESSORY_TEXT_SPACING_EXPANDED";
            case 25:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_GAP_ACCESSORY_TEXT_SPACING_STANDARD";
            case 26:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_GAP_INLINE_SPACING";
            case 27:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_GAP_TITLE_METADATA_SPACING";
            case 28:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_INSET_SPACING_COMPACT";
            case 29:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_INSET_SPACING_EXPANDED";
            case 30:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_INSET_SPACING_STANDARD";
            case 31:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_RADIUS_STANDARD";
            case 32:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_GAP_ACCESSORY_TEXT_SPACING_TINY";
            case 33:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_GAP_INLINE_SPACING_EXPANDED";
            case 34:
                return "YT_SYS_MEASUREMENT_REFERENCE_CONTAINMENT_INSET_SPACING_TINY";
            default:
                switch (i) {
                    case 40:
                        return "YT_SYS_MEASUREMENT_REFERENCE_FEED_COL_GAP_SMALL";
                    case 41:
                        return "YT_SYS_MEASUREMENT_REFERENCE_ICON_SIZE_PROMINENT";
                    case 42:
                        return "YT_SYS_MEASUREMENT_REFERENCE_ICON_SIZE_STANDARD";
                    default:
                        switch (i) {
                            case 51:
                                return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_COMFORTABLE";
                            case 52:
                                return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_COMPACT";
                            case 53:
                                return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_COZY";
                            case 54:
                                return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_EXPANDED";
                            case 55:
                                return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_HAIRLINE";
                            case 56:
                                return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_HERO";
                            case 57:
                                return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_PROMINENT";
                            default:
                                switch (i) {
                                    case 69:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_COMFORTABLE";
                                    case 70:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_COMPACT";
                                    case 71:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_CONDENSED";
                                    case 72:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_COZY";
                                    case 73:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_EXPANDED";
                                    case 74:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_HERO";
                                    case 75:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_HUGE";
                                    case 76:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_LEGEND";
                                    case 77:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_MAX";
                                    case 78:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_MINI";
                                    case 79:
                                        return "YT_SYS_MEASUREMENT_REFERENCE_AVATAR_SIZE_PROMINENT";
                                    default:
                                        switch (i) {
                                            case 83:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_ICON_SIZE_COMFORTABLE";
                                            case 84:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_ICON_SIZE_COMPACT";
                                            case 85:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_ICON_SIZE_CONDENSED";
                                            case 86:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_ICON_SIZE_COZY";
                                            case 87:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_ICON_SIZE_EXPANDED";
                                            case 88:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_ICON_SIZE_MINI";
                                            case 89:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_COMFORTABLE";
                                            case 90:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_COMPACT";
                                            case 91:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_CONDENSED";
                                            case 92:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_COZY";
                                            case 93:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_EXPANDED";
                                            case 94:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_HERO";
                                            case 95:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_HUGE";
                                            case 96:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_PROMINENT";
                                            case 97:
                                                return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_CONDENSED";
                                            default:
                                                switch (i) {
                                                    case 99:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_STROKE_COMFORTABLE";
                                                    case 100:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_STROKE_EXPANDED";
                                                    case 101:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_HUGE";
                                                    case 102:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_LEGEND";
                                                    case 103:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_MINI";
                                                    case 104:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_TINY";
                                                    case 105:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_STROKE_COZY";
                                                    case 106:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_MAX";
                                                    case 107:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_RADIUS_MIN";
                                                    case 108:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_ICON_SIZE_HERO";
                                                    case 109:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_MIN";
                                                    case 110:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_72";
                                                    case 111:
                                                        return "YT_SYS_MEASUREMENT_REFERENCE_SIZE_MAX";
                                                    default:
                                                        return "null";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static int V(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            default:
                switch (i) {
                    case 39:
                        return 40;
                    case 40:
                        return 41;
                    case 41:
                        return 42;
                    default:
                        switch (i) {
                            case 50:
                                return 51;
                            case 51:
                                return 52;
                            case 52:
                                return 53;
                            case 53:
                                return 54;
                            case 54:
                                return 55;
                            case 55:
                                return 56;
                            case 56:
                                return 57;
                            default:
                                switch (i) {
                                    case 68:
                                        return 69;
                                    case 69:
                                        return 70;
                                    case 70:
                                        return 71;
                                    case 71:
                                        return 72;
                                    case 72:
                                        return 73;
                                    case 73:
                                        return 74;
                                    case 74:
                                        return 75;
                                    case 75:
                                        return 76;
                                    case 76:
                                        return 77;
                                    case 77:
                                        return 78;
                                    case 78:
                                        return 79;
                                    default:
                                        switch (i) {
                                            case 82:
                                                return 83;
                                            case 83:
                                                return 84;
                                            case 84:
                                                return 85;
                                            case 85:
                                                return 86;
                                            case 86:
                                                return 87;
                                            case 87:
                                                return 88;
                                            case 88:
                                                return 89;
                                            case 89:
                                                return 90;
                                            case 90:
                                                return 91;
                                            case 91:
                                                return 92;
                                            case 92:
                                                return 93;
                                            case 93:
                                                return 94;
                                            case 94:
                                                return 95;
                                            case 95:
                                                return 96;
                                            case 96:
                                                return 97;
                                            default:
                                                switch (i) {
                                                    case 98:
                                                        return 99;
                                                    case 99:
                                                        return 100;
                                                    case 100:
                                                        return 101;
                                                    case 101:
                                                        return 102;
                                                    case 102:
                                                        return 103;
                                                    case 103:
                                                        return 104;
                                                    case 104:
                                                        return 105;
                                                    case 105:
                                                        return 106;
                                                    case 106:
                                                        return 107;
                                                    case 107:
                                                        return 108;
                                                    case 108:
                                                        return 109;
                                                    case 109:
                                                        return 110;
                                                    case 110:
                                                        return 111;
                                                    default:
                                                        return 0;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private static void W(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory()) {
            if (!Files.isSymbolicLink(FileSystems.getDefault().getPath(file.getPath(), new String[0])) && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    W(file2);
                }
            }
        }
        file.delete();
    }

    public static void a(File file) {
        if (file != null) {
            W(file);
        }
    }

    public static final /* synthetic */ atxu b(aihh aihhVar) {
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        return (atxu) aihnVarBuild;
    }

    public static final void c(aihh aihhVar) {
        aihhVar.copyOnWrite();
        atxu atxuVar = (atxu) aihhVar.instance;
        atxu atxuVar2 = atxu.a;
        atxuVar.b |= 2;
        atxuVar.d = true;
    }

    public static int d(int i) {
        return i == 1 ? aiif.a() : i - 2;
    }

    public static final /* synthetic */ asnc e(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (asnc) aihnVarBuild;
    }

    public static final void f(aslh aslhVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        asnc asncVar = (asnc) aihfVar.instance;
        asnc asncVar2 = asnc.a;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
    }

    public static int g(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 0 : 4;
        }
        return 3;
    }

    public static final /* synthetic */ CommandOuterClass$Command h(aihh aihhVar) {
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        return (CommandOuterClass$Command) aihnVarBuild;
    }

    public static final /* synthetic */ askp i(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (askp) aihnVarBuild;
    }

    public static final void j(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        askp askpVar = (askp) aihfVar.instance;
        askp askpVar2 = askp.a;
        askpVar.b |= 1;
        askpVar.c = str;
    }

    public static final /* synthetic */ aiko k(aihf aihfVar) {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((augd) aihfVar.instance).b));
        mapUnmodifiableMap.getClass();
        return new aiko(mapUnmodifiableMap);
    }

    public static final /* synthetic */ augd l(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (augd) aihnVarBuild;
    }

    public static final /* synthetic */ aiko m(aihf aihfVar) {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((auge) aihfVar.instance).c));
        mapUnmodifiableMap.getClass();
        return new aiko(mapUnmodifiableMap);
    }

    public static final /* synthetic */ auge n(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (auge) aihnVarBuild;
    }

    public static final /* synthetic */ void o(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aufz) aihfVar.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ void p(aihf aihfVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((aufx) aihfVar.instance).c);
        listUnmodifiableList.getClass();
        new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ auft q(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (auft) aihnVarBuild;
    }

    public static final void r(auev auevVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        auft auftVar = (auft) aihfVar.instance;
        auft auftVar2 = auft.a;
        auftVar.f = auevVar;
        auftVar.c |= 4;
    }

    public static final void s(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        auft auftVar = (auft) aihfVar.instance;
        auft auftVar2 = auft.a;
        auftVar.c |= 32;
        auftVar.h = str;
    }

    public static final /* synthetic */ auey t(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (auey) aihnVarBuild;
    }

    public static final void u(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        auey aueyVar = (auey) aihfVar.instance;
        auey aueyVar2 = auey.a;
        aueyVar.b |= 1;
        aueyVar.c = str;
    }

    public static final /* synthetic */ auhb v(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (auhb) aihnVarBuild;
    }

    public static final void w(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        auhb auhbVar = (auhb) aihfVar.instance;
        auhb auhbVar2 = auhb.a;
        auhbVar.b |= 2;
        auhbVar.d = i;
    }

    public static final void x(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        auhb auhbVar = (auhb) aihfVar.instance;
        auhb auhbVar2 = auhb.a;
        auhbVar.b |= 16;
        auhbVar.g = str;
    }

    public static final /* synthetic */ aikl y(auhq auhqVar) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(((auhs) auhqVar.instance).m);
        listUnmodifiableList.getClass();
        return new aikl(listUnmodifiableList);
    }

    public static final /* synthetic */ auhs z(auhq auhqVar) {
        aihn aihnVarBuild = auhqVar.build();
        aihnVarBuild.getClass();
        return (auhs) aihnVarBuild;
    }
}
