package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class irh implements zqm {
    private final /* synthetic */ int $cid;

    public irh(int i) {
        this.$cid = i;
    }

    @Override // defpackage.zqm
    public final yno a(zrg zrgVar) {
        zqk zqkVar;
        switch (this.$cid) {
            case 0:
                if (zrgVar instanceof iri) {
                    return new zqk(new gnr());
                }
                Class<?> cls = zrgVar.getClass();
                int i = awrn.a;
                throw new IllegalArgumentException("Expected BrowseUnlimitedRoute but got ".concat(String.valueOf(new awqv(cls).c())));
            case 1:
                if (zrgVar instanceof irg) {
                    return new zqk(new gnj());
                }
                Class<?> cls2 = zrgVar.getClass();
                int i2 = awrn.a;
                throw new IllegalArgumentException("Expected BrowseHistoryRoute but got ".concat(String.valueOf(new awqv(cls2).c())));
            case 2:
                if (zrgVar instanceof irj) {
                    return new zqk(new gnv());
                }
                Class<?> cls3 = zrgVar.getClass();
                int i3 = awrn.a;
                throw new IllegalArgumentException("Expected DefaultBrowseRoute but got ".concat(String.valueOf(new awqv(cls3).c())));
            case 3:
                if (zrgVar instanceof irk) {
                    return new zqk(new goc());
                }
                Class<?> cls4 = zrgVar.getClass();
                int i4 = awrn.a;
                throw new IllegalArgumentException("Expected ExploreBrowseRoute but got ".concat(String.valueOf(new awqv(cls4).c())));
            case 4:
                if (zrgVar instanceof irl) {
                    return new zqk(new hdd());
                }
                Class<?> cls5 = zrgVar.getClass();
                int i5 = awrn.a;
                throw new IllegalArgumentException("Expected GeneratedThumbnailsDisclaimerRoute but got ".concat(String.valueOf(new awqv(cls5).c())));
            case 5:
                if (zrgVar instanceof irm) {
                    return new zqk(new hdj());
                }
                Class<?> cls6 = zrgVar.getClass();
                int i6 = awrn.a;
                throw new IllegalArgumentException("Expected GeneratedThumbnailsSelectorRoute but got ".concat(String.valueOf(new awqv(cls6).c())));
            case 6:
                if (zrgVar instanceof irn) {
                    return new zqk(new gox());
                }
                Class<?> cls7 = zrgVar.getClass();
                int i7 = awrn.a;
                throw new IllegalArgumentException("Expected InnertubeDetailPageRoute but got ".concat(String.valueOf(new awqv(cls7).c())));
            case 7:
                if (zrgVar instanceof iro) {
                    return new zqk(new gpl());
                }
                Class<?> cls8 = zrgVar.getClass();
                int i8 = awrn.a;
                throw new IllegalArgumentException("Expected LibraryBrowseRoute but got ".concat(String.valueOf(new awqv(cls8).c())));
            case 8:
                if (zrgVar instanceof irp) {
                    return new zqk(new jjf());
                }
                Class<?> cls9 = zrgVar.getClass();
                int i9 = awrn.a;
                throw new IllegalArgumentException("Expected MultiselectFormScreenRoute but got ".concat(String.valueOf(new awqv(cls9).c())));
            case 9:
                if (zrgVar instanceof irq) {
                    return new zqk(new hot());
                }
                Class<?> cls10 = zrgVar.getClass();
                int i10 = awrn.a;
                throw new IllegalArgumentException("Expected OfflinePlaylistDetailPageRoute but got ".concat(String.valueOf(new awqv(cls10).c())));
            case 10:
                if (zrgVar instanceof irr) {
                    return new zqk(new gpy());
                }
                Class<?> cls11 = zrgVar.getClass();
                int i11 = awrn.a;
                throw new IllegalArgumentException("Expected OnboardingBrowseRoute but got ".concat(String.valueOf(new awqv(cls11).c())));
            case 11:
                if (zrgVar instanceof irs) {
                    return new zqk(new ijl());
                }
                Class<?> cls12 = zrgVar.getClass();
                int i12 = awrn.a;
                throw new IllegalArgumentException("Expected PlaylistDetailPageRoute but got ".concat(String.valueOf(new awqv(cls12).c())));
            case 12:
                if (zrgVar instanceof iru) {
                    return new zqk(new gqi());
                }
                Class<?> cls13 = zrgVar.getClass();
                int i13 = awrn.a;
                throw new IllegalArgumentException("Expected RadioBuilderRoute but got ".concat(String.valueOf(new awqv(cls13).c())));
            case 13:
                if (!(zrgVar instanceof irv)) {
                    Class<?> cls14 = zrgVar.getClass();
                    int i14 = awrn.a;
                    throw new IllegalArgumentException("Expected SearchInputRoute but got ".concat(String.valueOf(new awqv(cls14).c())));
                }
                ioc iocVar = new ioc();
                irv irvVar = (irv) zrgVar;
                iocVar.l(irvVar.a, irvVar.b);
                zqkVar = new zqk(iocVar);
                break;
                break;
            case 14:
                if (!(zrgVar instanceof iry)) {
                    Class<?> cls15 = zrgVar.getClass();
                    int i15 = awrn.a;
                    throw new IllegalArgumentException("Expected SearchResultRoute but got ".concat(String.valueOf(new awqv(cls15).c())));
                }
                iog iogVar = new iog();
                iogVar.j(((iry) zrgVar).a);
                zqkVar = new zqk(iogVar);
                break;
                break;
            case 15:
                if (zrgVar instanceof irz) {
                    return new zqk(new ivj());
                }
                Class<?> cls16 = zrgVar.getClass();
                int i16 = awrn.a;
                throw new IllegalArgumentException("Expected SideloadedPlaylistRoute but got ".concat(String.valueOf(new awqv(cls16).c())));
            case 16:
                if (zrgVar instanceof isa) {
                    return new zqk(new ivn());
                }
                Class<?> cls17 = zrgVar.getClass();
                int i17 = awrn.a;
                throw new IllegalArgumentException("Expected SignInRoute but got ".concat(String.valueOf(new awqv(cls17).c())));
            case 17:
                if (zrgVar instanceof isb) {
                    return new zqk(new jjm());
                }
                Class<?> cls18 = zrgVar.getClass();
                int i18 = awrn.a;
                throw new IllegalArgumentException("Expected TastebuilderRoute but got ".concat(String.valueOf(new awqv(cls18).c())));
            case 18:
                if (zrgVar instanceof isc) {
                    return new zqk(new grf());
                }
                Class<?> cls19 = zrgVar.getClass();
                int i19 = awrn.a;
                throw new IllegalArgumentException("Expected TopLevelBrowseRoute but got ".concat(String.valueOf(new awqv(cls19).c())));
            default:
                if (!(zrgVar instanceof isd)) {
                    Class<?> cls20 = zrgVar.getClass();
                    int i20 = awrn.a;
                    throw new IllegalArgumentException("Expected VoiceSearchRoute but got ".concat(String.valueOf(new awqv(cls20).c())));
                }
                isd isdVar = (isd) zrgVar;
                zqkVar = new zqk(jmg.m(isdVar.a, isdVar.b, isdVar.c));
                break;
                break;
        }
        return zqkVar;
    }
}
