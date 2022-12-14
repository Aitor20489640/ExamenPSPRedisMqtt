package constants;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Constantes {
    public static final String MQTT_SERVER_URI = "tcp://54.166.107.43:1883";
    public static final String REDIS_SERVER_URI = "54.166.107.43";
    public static final int REDIS_SERVER_PORT = 6000;
    public static final String INICIALES_ALUMNO = "ARG";
    public static final String subscribeAllStationsTopics = "/ARG/METEO/#";
    public static final String ALERTS_KEY_REDIS = "ARG:ALERTS";
    public static final String FORMAT_ALERT_STRING = "Alerta por temperaturas extremas el %s a las %s en la estación %s";
    public static final String HASH_KEY_LAST_TEMPERATURE_REDIS = "%s:LASTMEASUREMENT:%s";

    public static void connectMqttClient(MqttClient client) throws MqttException {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setAutomaticReconnect(true);
        options.setCleanSession(true);
        options.setConnectionTimeout(10);
        client.connect(options);
    }
}
