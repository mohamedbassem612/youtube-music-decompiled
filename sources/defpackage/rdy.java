package defpackage;

import com.google.mediapipe.framework.MediaPipeException;
import j$.util.function.BiFunction$CC;
import java.util.AbstractMap;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rdy implements ret {
    public static final agkj a;
    public final req b;

    static {
        final int i = 0;
        final int i2 = 2;
        final int i3 = 1;
        final int i4 = 3;
        final int i5 = 4;
        final int i6 = 6;
        final int i7 = 5;
        a = agkj.r(new AbstractMap.SimpleImmutableEntry(quy.class, new rdx() { // from class: rdw
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i8 = i;
                if (i8 == 0) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 1) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 2) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 3) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 != 4) {
                    return i8 != 5 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
                }
                return BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i8 = i;
                if (i8 == 0) {
                    qup qupVar = (qup) obj;
                    req reqVar = (req) obj2;
                    agkj agkjVar = rdy.a;
                    if (reqVar.p().a.ah) {
                        return new rdv(qupVar, reqVar);
                    }
                    int i9 = rff.i;
                    ?? r3 = ahxo.a.a;
                    if (r3.containsKey(atrd.class) && !((String) r3.get(atrd.class)).equals("drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput")) {
                        throw new MediaPipeException(ahxn.ALREADY_EXISTS.ordinal(), "Protobuf type name: drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput conflicts with: ".concat(String.valueOf((String) r3.get(atrd.class))));
                    }
                    r3.put(atrd.class, "drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput");
                    return new rff(qupVar, reqVar);
                }
                if (i8 == 1) {
                    qup qupVar2 = (qup) obj;
                    req reqVar2 = (req) obj2;
                    agkj agkjVar2 = rdy.a;
                    return qupVar2 instanceof rck ? new rci((rck) qupVar2, reqVar2) : new rfi(qupVar2, reqVar2);
                }
                if (i8 == 2) {
                    return new ree((qup) obj, (req) obj2);
                }
                if (i8 == 3) {
                    return new rfa((qup) obj, (req) obj2);
                }
                if (i8 == 4) {
                    return new rev((qup) obj, (req) obj2);
                }
                if (i8 == 5) {
                    return new rea((qup) obj, (req) obj2);
                }
                qup qupVar3 = (qup) obj;
                req reqVar3 = (req) obj2;
                agkj agkjVar3 = rdy.a;
                return reqVar3.p().a.E ? new reh((rco) qupVar3, reqVar3) : new rey((rco) qupVar3, reqVar3);
            }
        }), new AbstractMap.SimpleImmutableEntry(quv.class, new rdx() { // from class: rdw
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i8 = i2;
                if (i8 == 0) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 1) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 2) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 3) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 != 4) {
                    return i8 != 5 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
                }
                return BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i8 = i2;
                if (i8 == 0) {
                    qup qupVar = (qup) obj;
                    req reqVar = (req) obj2;
                    agkj agkjVar = rdy.a;
                    if (reqVar.p().a.ah) {
                        return new rdv(qupVar, reqVar);
                    }
                    int i9 = rff.i;
                    ?? r3 = ahxo.a.a;
                    if (r3.containsKey(atrd.class) && !((String) r3.get(atrd.class)).equals("drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput")) {
                        throw new MediaPipeException(ahxn.ALREADY_EXISTS.ordinal(), "Protobuf type name: drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput conflicts with: ".concat(String.valueOf((String) r3.get(atrd.class))));
                    }
                    r3.put(atrd.class, "drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput");
                    return new rff(qupVar, reqVar);
                }
                if (i8 == 1) {
                    qup qupVar2 = (qup) obj;
                    req reqVar2 = (req) obj2;
                    agkj agkjVar2 = rdy.a;
                    return qupVar2 instanceof rck ? new rci((rck) qupVar2, reqVar2) : new rfi(qupVar2, reqVar2);
                }
                if (i8 == 2) {
                    return new ree((qup) obj, (req) obj2);
                }
                if (i8 == 3) {
                    return new rfa((qup) obj, (req) obj2);
                }
                if (i8 == 4) {
                    return new rev((qup) obj, (req) obj2);
                }
                if (i8 == 5) {
                    return new rea((qup) obj, (req) obj2);
                }
                qup qupVar3 = (qup) obj;
                req reqVar3 = (req) obj2;
                agkj agkjVar3 = rdy.a;
                return reqVar3.p().a.E ? new reh((rco) qupVar3, reqVar3) : new rey((rco) qupVar3, reqVar3);
            }
        }), new AbstractMap.SimpleImmutableEntry(qux.class, new rdx() { // from class: rdw
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i8 = i4;
                if (i8 == 0) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 1) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 2) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 3) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 != 4) {
                    return i8 != 5 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
                }
                return BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i8 = i4;
                if (i8 == 0) {
                    qup qupVar = (qup) obj;
                    req reqVar = (req) obj2;
                    agkj agkjVar = rdy.a;
                    if (reqVar.p().a.ah) {
                        return new rdv(qupVar, reqVar);
                    }
                    int i9 = rff.i;
                    ?? r3 = ahxo.a.a;
                    if (r3.containsKey(atrd.class) && !((String) r3.get(atrd.class)).equals("drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput")) {
                        throw new MediaPipeException(ahxn.ALREADY_EXISTS.ordinal(), "Protobuf type name: drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput conflicts with: ".concat(String.valueOf((String) r3.get(atrd.class))));
                    }
                    r3.put(atrd.class, "drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput");
                    return new rff(qupVar, reqVar);
                }
                if (i8 == 1) {
                    qup qupVar2 = (qup) obj;
                    req reqVar2 = (req) obj2;
                    agkj agkjVar2 = rdy.a;
                    return qupVar2 instanceof rck ? new rci((rck) qupVar2, reqVar2) : new rfi(qupVar2, reqVar2);
                }
                if (i8 == 2) {
                    return new ree((qup) obj, (req) obj2);
                }
                if (i8 == 3) {
                    return new rfa((qup) obj, (req) obj2);
                }
                if (i8 == 4) {
                    return new rev((qup) obj, (req) obj2);
                }
                if (i8 == 5) {
                    return new rea((qup) obj, (req) obj2);
                }
                qup qupVar3 = (qup) obj;
                req reqVar3 = (req) obj2;
                agkj agkjVar3 = rdy.a;
                return reqVar3.p().a.E ? new reh((rco) qupVar3, reqVar3) : new rey((rco) qupVar3, reqVar3);
            }
        }), new AbstractMap.SimpleImmutableEntry(quw.class, new rdx() { // from class: rdw
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i8 = i5;
                if (i8 == 0) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 1) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 2) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 3) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 != 4) {
                    return i8 != 5 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
                }
                return BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i8 = i5;
                if (i8 == 0) {
                    qup qupVar = (qup) obj;
                    req reqVar = (req) obj2;
                    agkj agkjVar = rdy.a;
                    if (reqVar.p().a.ah) {
                        return new rdv(qupVar, reqVar);
                    }
                    int i9 = rff.i;
                    ?? r3 = ahxo.a.a;
                    if (r3.containsKey(atrd.class) && !((String) r3.get(atrd.class)).equals("drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput")) {
                        throw new MediaPipeException(ahxn.ALREADY_EXISTS.ordinal(), "Protobuf type name: drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput conflicts with: ".concat(String.valueOf((String) r3.get(atrd.class))));
                    }
                    r3.put(atrd.class, "drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput");
                    return new rff(qupVar, reqVar);
                }
                if (i8 == 1) {
                    qup qupVar2 = (qup) obj;
                    req reqVar2 = (req) obj2;
                    agkj agkjVar2 = rdy.a;
                    return qupVar2 instanceof rck ? new rci((rck) qupVar2, reqVar2) : new rfi(qupVar2, reqVar2);
                }
                if (i8 == 2) {
                    return new ree((qup) obj, (req) obj2);
                }
                if (i8 == 3) {
                    return new rfa((qup) obj, (req) obj2);
                }
                if (i8 == 4) {
                    return new rev((qup) obj, (req) obj2);
                }
                if (i8 == 5) {
                    return new rea((qup) obj, (req) obj2);
                }
                qup qupVar3 = (qup) obj;
                req reqVar3 = (req) obj2;
                agkj agkjVar3 = rdy.a;
                return reqVar3.p().a.E ? new reh((rco) qupVar3, reqVar3) : new rey((rco) qupVar3, reqVar3);
            }
        }), new AbstractMap.SimpleImmutableEntry(rcm.class, new rdx() { // from class: rdw
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i8 = i6;
                if (i8 == 0) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 1) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 2) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 3) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 != 4) {
                    return i8 != 5 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
                }
                return BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i8 = i6;
                if (i8 == 0) {
                    qup qupVar = (qup) obj;
                    req reqVar = (req) obj2;
                    agkj agkjVar = rdy.a;
                    if (reqVar.p().a.ah) {
                        return new rdv(qupVar, reqVar);
                    }
                    int i9 = rff.i;
                    ?? r3 = ahxo.a.a;
                    if (r3.containsKey(atrd.class) && !((String) r3.get(atrd.class)).equals("drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput")) {
                        throw new MediaPipeException(ahxn.ALREADY_EXISTS.ordinal(), "Protobuf type name: drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput conflicts with: ".concat(String.valueOf((String) r3.get(atrd.class))));
                    }
                    r3.put(atrd.class, "drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput");
                    return new rff(qupVar, reqVar);
                }
                if (i8 == 1) {
                    qup qupVar2 = (qup) obj;
                    req reqVar2 = (req) obj2;
                    agkj agkjVar2 = rdy.a;
                    return qupVar2 instanceof rck ? new rci((rck) qupVar2, reqVar2) : new rfi(qupVar2, reqVar2);
                }
                if (i8 == 2) {
                    return new ree((qup) obj, (req) obj2);
                }
                if (i8 == 3) {
                    return new rfa((qup) obj, (req) obj2);
                }
                if (i8 == 4) {
                    return new rev((qup) obj, (req) obj2);
                }
                if (i8 == 5) {
                    return new rea((qup) obj, (req) obj2);
                }
                qup qupVar3 = (qup) obj;
                req reqVar3 = (req) obj2;
                agkj agkjVar3 = rdy.a;
                return reqVar3.p().a.E ? new reh((rco) qupVar3, reqVar3) : new rey((rco) qupVar3, reqVar3);
            }
        }), new AbstractMap.SimpleImmutableEntry(quz.class, new rdx() { // from class: rdw
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i8 = i3;
                if (i8 == 0) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 1) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 2) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 3) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 != 4) {
                    return i8 != 5 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
                }
                return BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i8 = i3;
                if (i8 == 0) {
                    qup qupVar = (qup) obj;
                    req reqVar = (req) obj2;
                    agkj agkjVar = rdy.a;
                    if (reqVar.p().a.ah) {
                        return new rdv(qupVar, reqVar);
                    }
                    int i9 = rff.i;
                    ?? r3 = ahxo.a.a;
                    if (r3.containsKey(atrd.class) && !((String) r3.get(atrd.class)).equals("drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput")) {
                        throw new MediaPipeException(ahxn.ALREADY_EXISTS.ordinal(), "Protobuf type name: drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput conflicts with: ".concat(String.valueOf((String) r3.get(atrd.class))));
                    }
                    r3.put(atrd.class, "drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput");
                    return new rff(qupVar, reqVar);
                }
                if (i8 == 1) {
                    qup qupVar2 = (qup) obj;
                    req reqVar2 = (req) obj2;
                    agkj agkjVar2 = rdy.a;
                    return qupVar2 instanceof rck ? new rci((rck) qupVar2, reqVar2) : new rfi(qupVar2, reqVar2);
                }
                if (i8 == 2) {
                    return new ree((qup) obj, (req) obj2);
                }
                if (i8 == 3) {
                    return new rfa((qup) obj, (req) obj2);
                }
                if (i8 == 4) {
                    return new rev((qup) obj, (req) obj2);
                }
                if (i8 == 5) {
                    return new rea((qup) obj, (req) obj2);
                }
                qup qupVar3 = (qup) obj;
                req reqVar3 = (req) obj2;
                agkj agkjVar3 = rdy.a;
                return reqVar3.p().a.E ? new reh((rco) qupVar3, reqVar3) : new rey((rco) qupVar3, reqVar3);
            }
        }), new AbstractMap.SimpleImmutableEntry(qut.class, new rdx() { // from class: rdw
            public final /* synthetic */ BiFunction andThen(Function function) {
                int i8 = i7;
                if (i8 == 0) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 1) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 2) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 == 3) {
                    return BiFunction$CC.$default$andThen(this, function);
                }
                if (i8 != 4) {
                    return i8 != 5 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
                }
                return BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i8 = i7;
                if (i8 == 0) {
                    qup qupVar = (qup) obj;
                    req reqVar = (req) obj2;
                    agkj agkjVar = rdy.a;
                    if (reqVar.p().a.ah) {
                        return new rdv(qupVar, reqVar);
                    }
                    int i9 = rff.i;
                    ?? r3 = ahxo.a.a;
                    if (r3.containsKey(atrd.class) && !((String) r3.get(atrd.class)).equals("drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput")) {
                        throw new MediaPipeException(ahxn.ALREADY_EXISTS.ordinal(), "Protobuf type name: drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput conflicts with: ".concat(String.valueOf((String) r3.get(atrd.class))));
                    }
                    r3.put(atrd.class, "drishti.app.skia.stickers.GlSkiaStickersCalculatorRuntimeOutput");
                    return new rff(qupVar, reqVar);
                }
                if (i8 == 1) {
                    qup qupVar2 = (qup) obj;
                    req reqVar2 = (req) obj2;
                    agkj agkjVar2 = rdy.a;
                    return qupVar2 instanceof rck ? new rci((rck) qupVar2, reqVar2) : new rfi(qupVar2, reqVar2);
                }
                if (i8 == 2) {
                    return new ree((qup) obj, (req) obj2);
                }
                if (i8 == 3) {
                    return new rfa((qup) obj, (req) obj2);
                }
                if (i8 == 4) {
                    return new rev((qup) obj, (req) obj2);
                }
                if (i8 == 5) {
                    return new rea((qup) obj, (req) obj2);
                }
                qup qupVar3 = (qup) obj;
                req reqVar3 = (req) obj2;
                agkj agkjVar3 = rdy.a;
                return reqVar3.p().a.E ? new reh((rco) qupVar3, reqVar3) : new rey((rco) qupVar3, reqVar3);
            }
        }));
    }

    public rdy(req reqVar) {
        this.b = reqVar;
    }
}
