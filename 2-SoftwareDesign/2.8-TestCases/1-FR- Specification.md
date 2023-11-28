### Функція RequestForFood
Опис:
Ця функція, RequestForFood(), призначена для обробки запитів користувачів щодо харчування. Користувач може запитати про безпечність їжі, наявність алергенів, кількість калорій, а також отримати рекомендації щодо щоденного споживання.

Вхідні параметри:
foodType (Тип: Рядок):

Тип їжі, про яку користувач хоче отримати інформацію (наприклад, "суп", "салат").
Обмеження значень: Рядок не може бути порожнім.

userProfile (Тип: Об'єкт UserProfile):
Об'єкт, що представляє профіль користувача, що надсилає запит.

Обмеження значень:
userId (Тип: Число): Унікальний ідентифікатор користувача.

userName (Тип: Рядок): Ім'я користувача.

Обидва параметри є обов'язковими.

Вихідні параметри:
foodInfo (Тип: Об'єкт FoodInformation):
Об'єкт, що містить інформацію про запитану їжу.
Обмеження значень:

safetyStatus (Тип: Булево): Чи є їжа безпечною для споживання.
allergens (Тип: Список рядків): Список алергенів у їжі.
calories (Тип: Число): Кількість калорій у порції їжі.
dailyRecommendation (Тип: Об'єкт DailyRecommendation): Рекомендації щодо щоденного споживання.
protein (Тип: Число): Рекомендована кількість білка.
carbohydrates (Тип: Число): Рекомендована кількість вуглеводів.
fat (Тип: Число): Рекомендована кількість жирів.