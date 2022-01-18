# CC-2021
Stepanoski Vanja E2 10/2021

# Kontrolna tacka 3

## Kako pokrenuti

- [ ] pozicionirati se u direktorijum   ->      cd kontrolna_tacka_1_spring_boot
- [ ] pokrenuti komandu                 ->      docker-compose -f docker-compose-kt3.yml up -d

## Kako proveriti da li radi

- [ ] otici na adresu                   ->      http://localhost:8080/counters

## Kako proveriti volume

- [ ] pokrenuti komandu                 ->      docker-compose -f docker-compose-kt3.yml down
- [ ] pokrenuti komandu                 ->      docker-compose -f docker-compose-kt3.yml up -d
- [ ] proveriti da li se counter resetovao, ili je nastavio gde je stao sa brojanjem

# Kontrolna tacka 2

## Kako pokrenuti
- [ ] vagrant up <- podizanje VM traje oko 10 minuta, be patient

## Kako proveriti da li radi
- [ ] 10.10.10.10:8080/counters <- otici na ovu adresu

## Opis fajlova
- [ ] webapp <- source code aplikacije
- [ ] docker-compose.yml <- fajl u kome je specifikacija za pokretanje baze i aplikacije
- [ ] Vagrantfile <- fajl u kome je specifikacija VM-a
- [ ] vagrantEnv.sh <- skripta za upisivanje environment varijabli
- [ ] vagrantInit.sh <- skripta za pokretanje baze i aplikacije