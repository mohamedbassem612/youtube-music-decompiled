package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hde implements adlz {
    private final /* synthetic */ int $cid;

    public static boolean b(adly adlyVar) {
        Object objC = adlyVar.c("applyThumbnailBlur");
        return (objC instanceof Boolean) && ((Boolean) objC).booleanValue();
    }

    @Override // defpackage.adlz
    public final void a(adly adlyVar, adkz adkzVar, int i) {
        switch (this.$cid) {
            case 0:
                adlyVar.f("selectableThumbnailConfig", new jfq());
                break;
            case 1:
                adlyVar.f("positionInAdapter", Integer.valueOf(i));
                break;
            case 2:
                adlyVar.f("buttonTextAlignment", 5);
                break;
            case 3:
                adlyVar.f("isDraggable", Boolean.FALSE);
                break;
            case 4:
                agrf agrfVar = iog.a;
                adlyVar.f("chipCloudCentered", Boolean.TRUE);
                break;
            case 5:
                agrf agrfVar2 = iog.a;
                adlyVar.f("musicCardShelfLayout", gzk.b);
                break;
            case 6:
                adlyVar.f("useSheetsMenuStyle", Boolean.TRUE);
                break;
            case 7:
                adlyVar.f("sectionControllerPosition", Integer.valueOf(i));
                break;
            case 8:
                adlyVar.f("hideKeyboardOnClick", Boolean.TRUE);
                break;
            case 9:
                adlyVar.f("hideKeyboardOnClick", Boolean.TRUE);
                break;
            case 10:
                adlyVar.f("applyThumbnailBlur", Boolean.TRUE);
                break;
            case 11:
                adlyVar.f("applyThumbnailRipple", Boolean.TRUE);
                break;
            case 12:
                adlyVar.f("isFirstItem", Boolean.valueOf(i == 0));
                break;
            default:
                adlyVar.f("isLastItem", Boolean.valueOf(i == adkzVar.a() + (-1)));
                break;
        }
    }
}
