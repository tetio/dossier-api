package net.portic.mypcs.dossier.chance;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.function.Supplier;

public class App
{
    public static void main( String[] args ) throws ScriptException, NoSuchMethodException {
        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("nashorn");
        // Create a source for random numbers, as the built-in mersene twister suffers some problems
        final Random random = new Random();
        engine.put("generator", (Supplier<Object>) random::nextDouble);

        // Add a global object, so we can get a reference to net.portic.mypcs.dossier.chance
        final Object exports = engine.eval("exports = {}");

        // Read net.portic.mypcs.dossier.chance.js from the classpath
        final InputStreamReader reader = new InputStreamReader(App.class.getClassLoader().getResourceAsStream("chance.js"));
        // Execute net.portic.mypcs.dossier.chance.js
        engine.eval(reader);

        // Get a usable interface to net.portic.mypcs.dossier.chance.js
        final Object chance = engine.eval("new exports.Chance(function(){ return generator.get(); })");
        Invocable invocable = (Invocable) engine;
        final Chance anInterface = invocable.getInterface(chance, Chance.class);

        // Try using the interface
        System.out.println(anInterface.bool());
        System.out.println(anInterface.floating());
        System.out.println(anInterface.character());
        System.out.println(anInterface.integer());
        System.out.println(anInterface.natural());
        System.out.println(anInterface.string());
        System.out.println(anInterface.sentence());
        System.out.println(anInterface.paragraph());
        System.out.println(anInterface.syllable());
        System.out.println(anInterface.word());
        System.out.println(anInterface.age());
        System.out.println(anInterface.birthday());
        System.out.println(anInterface.cpf());
        System.out.println(anInterface.first());
        System.out.println(anInterface.last());
        System.out.println(anInterface.name());
        System.out.println(anInterface.gender());
        System.out.println(anInterface.color());
        System.out.println(anInterface.domain());
        System.out.println(anInterface.email());
        System.out.println(anInterface.fbid());
        System.out.println(anInterface.google_analytics());
        System.out.println(anInterface.hashtag());
        System.out.println(anInterface.ip());
        System.out.println(anInterface.ipv6());
        System.out.println(anInterface.klout());
        System.out.println(anInterface.tld());
        System.out.println(anInterface.twitter());
        System.out.println(anInterface.url());
        System.out.println(anInterface.address());
        System.out.println(anInterface.altitude());
        System.out.println(anInterface.areacode());
        System.out.println(anInterface.city());
        System.out.println(anInterface.coordinates());
        System.out.println(anInterface.country());
        System.out.println(anInterface.depth());
        System.out.println(anInterface.geohash());
        System.out.println(anInterface.latitude());
        System.out.println(anInterface.longitude());
        System.out.println(anInterface.phone());
        System.out.println(anInterface.postal());
        System.out.println(anInterface.province());
        System.out.println(anInterface.state());
        System.out.println(anInterface.street());
        System.out.println(anInterface.zip());
        System.out.println(anInterface.ampm());
        System.out.println(anInterface.date());
        System.out.println(anInterface.hammertime());
        System.out.println(anInterface.hour());
        System.out.println(anInterface.millisecond());
        System.out.println(anInterface.minute());
        System.out.println(anInterface.month());
        System.out.println(anInterface.second());
        System.out.println(anInterface.timestamp());
        System.out.println(anInterface.year());
        System.out.println(anInterface.cc());
        System.out.println(anInterface.cc_type());
        System.out.println(anInterface.currency());
        System.out.println(anInterface.currency_pair());
        System.out.println(anInterface.dollar());
        System.out.println(anInterface.exp());
        System.out.println(anInterface.exp_month());
        System.out.println(anInterface.exp_year());
        System.out.println(anInterface.prefix());
        System.out.println(anInterface.ssn());
        System.out.println(anInterface.suffix());
        System.out.println(anInterface.android_id());
        System.out.println(anInterface.apple_token());
        System.out.println(anInterface.bb_pin());
        System.out.println(anInterface.wp7_anid());
        //System.out.println(anInterface.wp8_anid2()); needs base64 encoder

    }
}