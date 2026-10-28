package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nss {
    public static ohz a(oip oipVar) {
        ohz ohzVar = (ohz) aihn.parseFrom(ohz.a, oipVar.toByteArray(), ExtensionRegistryLite.a);
        agke agkeVar = (agke) Collection.EL.stream(oipVar.o).map(new iuk(ohzVar, 10)).collect(aghu.a);
        aihf builder = ohzVar.toBuilder();
        builder.copyOnWrite();
        ((ohz) builder.instance).g = ohz.emptyProtobufList();
        builder.copyOnWrite();
        ohz ohzVar2 = (ohz) builder.instance;
        aiie aiieVar = ohzVar2.g;
        if (!aiieVar.c()) {
            ohzVar2.g = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(agkeVar, ohzVar2.g);
        return (ohz) builder.build();
    }
}
